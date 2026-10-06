const http = require("http");
const fs = require("fs");
const path = require("path");

const PORT = 5000;
const uploadDirectory = path.join(__dirname, "uploads");

if (!fs.existsSync(uploadDirectory)) {
  fs.mkdirSync(uploadDirectory);
}

function sendResponse(res, statusCode, data, contentType = "application/json") {
  res.writeHead(statusCode, {
    "Content-Type": contentType,
    "Access-Control-Allow-Origin": "*",
    "Access-Control-Allow-Methods": "GET, POST, OPTIONS",
    "Access-Control-Allow-Headers": "Content-Type"
  });
  res.end(
    contentType === "application/json"
      ? JSON.stringify(data)
      : data
  );
}

function getContentType(fileName) {
  const extension = path.extname(fileName).toLowerCase();
  const types = {
    ".pdf": "application/pdf",
    ".txt": "text/plain",
    ".doc": "application/msword",
    ".docx":
      "application/vnd.openxmlformats-officedocument.wordprocessingml.document",
    ".png": "image/png",
    ".jpg": "image/jpeg",
    ".jpeg": "image/jpeg"
  };
  return types[extension] || "application/octet-stream";
}

function parseMultipart(req, bodyBuffer) {
  const contentType = req.headers["content-type"];
  if (!contentType || !contentType.includes("multipart/form-data")) {
    return null;
  }
  const boundary = contentType.split("boundary=")[1];
  if (!boundary) {
    return null;
  }
  const boundaryBuffer = Buffer.from("--" + boundary);
  const parts = [];
  let start = 0;
  while (true) {
    const boundaryIndex = bodyBuffer.indexOf(boundaryBuffer, start);
    if (boundaryIndex === -1) {
      break;
    }
    const nextBoundary = bodyBuffer.indexOf(
      boundaryBuffer,
      boundaryIndex + boundaryBuffer.length
    );
    if (nextBoundary === -1) {
      break;
    }
    const part = bodyBuffer.slice(
      boundaryIndex + boundaryBuffer.length,
      nextBoundary
    );
    parts.push(part);
    start = nextBoundary;
  }
  for (const part of parts) {
    const headerEnd = part.indexOf(
      Buffer.from("\r\n\r\n")
    );
    if (headerEnd === -1) {
      continue;
    }
    const headers = part
      .slice(0, headerEnd)
      .toString();
    const fileMatch = headers.match(
      /filename="([^"]+)"/
    );
    if (!fileMatch) {
      continue;
    }
    const fileName = path.basename(fileMatch[1]);
    let fileData = part.slice(headerEnd + 4);
    if (
      fileData.slice(-2).toString() === "\r\n"
    ) {
      fileData = fileData.slice(0, -2);
    }
    return {
      fileName,
      fileData
    };
  }
  return null;
}

const server = http.createServer((req, res) => {
  if (req.method === "OPTIONS") {
    sendResponse(res, 204, "");
    return;
  }

  if (req.method === "POST" && req.url === "/api/upload") {
    const chunks = [];
    req.on("data", chunk => {
      chunks.push(chunk);
    });
    req.on("end", () => {
      try {
        const body = Buffer.concat(chunks);
        const file = parseMultipart(req, body);

        if (!file) {
          sendResponse(res, 400, {
            message: "No file received."
          });
          return;
        }

        const allowedExtensions = [
          ".pdf",
          ".doc",
          ".docx",
          ".txt",
          ".png",
          ".jpg",
          ".jpeg"
        ];
        const extension = path
          .extname(file.fileName)
          .toLowerCase();

        if (!allowedExtensions.includes(extension)) {
          sendResponse(res, 400, {
            message: "Invalid file type."
          });
          return;
        }

        const maxSize = 5 * 1024 * 1024;
        if (file.fileData.length > maxSize) {
          sendResponse(res, 400, {
            message: "File size must be 5 MB or less."
          });
          return;
        }

        const safeFileName =
          Date.now() + "-" + file.fileName;
        const filePath = path.join(
          uploadDirectory,
          safeFileName
        );
        fs.writeFileSync(filePath, file.fileData);

        sendResponse(res, 201, {
          message: "File uploaded successfully.",
          fileName: file.fileName,
          storedName: safeFileName,
          fileSize: file.fileData.length,
          fileType: getContentType(file.fileName)
        });
      } catch (error) {
        sendResponse(res, 500, {
          message: "File upload failed."
        });
      }
    });
    return;
  }

  if (
    req.method === "GET" &&
    req.url.startsWith("/api/download/")
  ) {
    const storedName = decodeURIComponent(
      req.url.replace("/api/download/", "")
    );
    const safeName = path.basename(storedName);
    const filePath = path.join(
      uploadDirectory,
      safeName
    );

    if (!fs.existsSync(filePath)) {
      sendResponse(res, 404, {
        message: "File not found."
      });
      return;
    }

    const originalName =
      safeName.substring(safeName.indexOf("-") + 1);

    res.writeHead(200, {
      "Content-Type": getContentType(originalName),
      "Content-Disposition":
        `attachment; filename="${originalName}"`,
      "Access-Control-Allow-Origin": "*"
    });

    fs.createReadStream(filePath).pipe(res);
    return;
  }

  sendResponse(res, 404, {
    message: "Route not found."
  });
});

server.listen(PORT, () => {
  console.log(`Server running on http://localhost:${PORT}`);
});
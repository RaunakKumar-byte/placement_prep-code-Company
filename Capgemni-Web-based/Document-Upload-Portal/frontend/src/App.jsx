import { useState } from "react";
import FileSelector from "./components/FileSelector";
import UploadProgress from "./components/UploadProgress";
import DocumentInfo from "./components/DocumentInfo";

const API_URL = "http://localhost:5000/api/upload";
const MAX_FILE_SIZE = 5 * 1024 * 1024;
const allowedExtensions = [
  ".pdf",
  ".doc",
  ".docx",
  ".txt",
  ".png",
  ".jpg",
  ".jpeg"
];

function App() {
  const [file, setFile] = useState(null);
  const [progress, setProgress] = useState(0);
  const [message, setMessage] = useState("");
  const [messageType, setMessageType] = useState("");
  const [document, setDocument] = useState(null);
  const [uploading, setUploading] = useState(false);

  const validateFile = selectedFile => {
    if (!selectedFile) {
      return "Please select a file.";
    }
    const extension = selectedFile.name
      .substring(selectedFile.name.lastIndexOf("."))
      .toLowerCase();

    if (!allowedExtensions.includes(extension)) {
      return "Invalid file type.";
    }

    if (selectedFile.size > MAX_FILE_SIZE) {
      return "File size must be 5 MB or less.";
    }

    return "";
  };

  const handleFileChange = event => {
    const selectedFile = event.target.files[0];
    setMessage("");
    setDocument(null);
    setProgress(0);

    const error = validateFile(selectedFile);
    if (error) {
      setFile(null);
      setMessage(error);
      setMessageType("error");
      return;
    }

    setFile(selectedFile);
  };

  const uploadFile = () => {
    const error = validateFile(file);
    if (error) {
      setMessage(error);
      setMessageType("error");
      return;
    }

    const formData = new FormData();
    formData.append("file", file);

    const xhr = new XMLHttpRequest();
    setUploading(true);
    setProgress(0);
    setMessage("");
    setDocument(null);

    xhr.open("POST", API_URL);

    xhr.upload.onprogress = event => {
      if (event.lengthComputable) {
        const percentage = Math.round(
          (event.loaded / event.total) * 100
        );
        setProgress(percentage);
      }
    };

    xhr.onload = () => {
      setUploading(false);
      try {
        const response = JSON.parse(xhr.responseText);
        if (xhr.status === 201) {
          setMessage(response.message);
          setMessageType("success");
          setDocument(response);
          setProgress(100);
        } else {
          setMessage(response.message);
          setMessageType("error");
        }
      } catch {
        setMessage("Unexpected server response.");
        setMessageType("error");
      }
    };

    xhr.onerror = () => {
      setUploading(false);
      setMessage("Unable to connect to the server.");
      setMessageType("error");
    };

    xhr.send(formData);
  };

  return (
    <div className="app">
      <header>
        <h1>Document Upload Portal</h1>
        <p>Upload and manage your documents</p>
      </header>
      <main>
        <FileSelector
          file={file}
          onFileChange={handleFileChange}
          onUpload={uploadFile}
          disabled={uploading}
        ></FileSelector>
        <UploadProgress progress={progress} ></UploadProgress>
        {message && (
          <div className={`message ${messageType}`}>
            {message}
          </div>
        )}
        <DocumentInfo document={document} ></DocumentInfo>
      </main>
    </div>
  );
}

export default App;
function formatSize(bytes) {
  if (bytes < 1024) {
    return `${bytes} Bytes`;
  }
  if (bytes < 1024 * 1024) {
    return `${(bytes / 1024).toFixed(2)} KB`;
  }
  return `${(bytes / (1024 * 1024)).toFixed(2)} MB`;
}

function DocumentInfo({ document }) {
  if (!document) {
    return null;
  }
  return (
    <div className="document-card">
      <h3>Uploaded Document</h3>
      <p>
        <strong>Name:</strong> {document.fileName}
      </p>
      <p>
        <strong>Type:</strong> {document.fileType}
      </p>
      <p>
        <strong>Size:</strong> {formatSize(document.fileSize)}
      </p>
      <a
        href={`http://localhost:5000/api/download/${encodeURIComponent(
          document.storedName
        )}`}
        className="download-button"
      >
        Download Document
      </a>
    </div>
  );
}

export default DocumentInfo;
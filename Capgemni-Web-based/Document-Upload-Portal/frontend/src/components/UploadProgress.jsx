function UploadProgress({ progress }) {
  if (progress <= 0) {
    return null;
  }
  return (
    <div className="progress-section">
      <p>Upload Progress: {progress}%</p>
      <div className="progress-bar">
        <div
          className="progress-fill"
          style={{ width: `${progress}%` }}
        ></div>
      </div>
    </div>
  );
}

export default UploadProgress;
function FileSelector({
  file,
  onFileChange,
  onUpload,
  disabled
}) {
  return (
    <div className="upload-box">
      <label>Select Document</label>
      <input
        type="file"
        accept=".pdf,.doc,.docx,.txt,.png,.jpg,.jpeg"
        onChange={onFileChange}
        disabled={disabled}
      />
      {file && (
        <p className="selected-file">
          Selected: {file.name}
        </p>
      )}
      <button
        onClick={onUpload}
        disabled={!file || disabled}
      >
        {disabled ? "Uploading..." : "Upload Document"}
      </button>
    </div>
  );
}

export default FileSelector;
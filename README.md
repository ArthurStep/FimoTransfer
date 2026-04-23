# FimoTransfer

## Architecture

### Core Classes
- **`FimoTransferApplication`**: the main entry point of the Spring Boot application
- **`FileController`**: handle file upload and download endpoints and web views
- **`MainController`**: handle basic home page routing
- **`FileUploadService`**: handle file upload logic, save files to disk, and generate unique access codes
- **`FileDownloadService`**: handle file retrieval logic and stream files to the client

## Development

### Project Structure
```text
src/main/java/main/artfix/FimoTransfer/
├── FimoTransferApplication.java  # Main entry point of the application
├── controllers/
│   ├── FileController.java       # Handle file upload and download endpoints
│   └── MainController.java       # Handle home page routing
└── services/
    ├── FileDownloadService.java  # Handle file download logic
    └── FileUploadService.java    # Handle file upload logic and code generation
```

## 📄 License

This project is open source and available under the [MIT License](LICENSE).


## 👨‍💻 Author

**Arthur Stepanyan**
- GitHub: [ArthurStep](https://github.com/ArthurStep)
- Version: 2.0

*Built with ☕ and lots of strategic thinking!*

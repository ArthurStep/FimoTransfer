package main.artfix.fimotransfer.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

@Service
public class FileUploadService {
    public String userCode;

    public void uploadFile(MultipartFile file) throws Exception{
            String uploadDir = "uploads";
            String projectDir = new File("").getAbsolutePath();

            Path uploadPath = Paths.get(projectDir, uploadDir);
            Files.createDirectories(uploadPath);

            String originalFileName = file.getOriginalFilename();
            assert originalFileName != null;
            String fileExtension = originalFileName.substring(originalFileName.lastIndexOf('.'));

            userCode = String.format("%06d", new Random().nextInt(999999));
            Path filePath = uploadPath.resolve(userCode + fileExtension);
            while (Files.exists(filePath)) {
                userCode = String.format("%06d", new Random().nextInt(999999));
                filePath = uploadPath.resolve(userCode + fileExtension);
            }
            System.out.println("New Code For File: " + userCode + fileExtension);
            userCode = userCode + fileExtension;

            file.transferTo(filePath.toFile());
    }
}

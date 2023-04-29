package main.artfix.fimotransfer.controllers;

import lombok.RequiredArgsConstructor;
import main.artfix.fimotransfer.services.FileUploadService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequiredArgsConstructor
public class FileController {

    private final FileUploadService fileUploadService;

    @RequestMapping("/upload")
    public String uploadPage(@RequestParam("fileWrite") MultipartFile file) throws Exception {
        fileUploadService.uploadFile(file);
        return "/home";
    }

}

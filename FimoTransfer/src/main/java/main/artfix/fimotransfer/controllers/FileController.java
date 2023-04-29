package main.artfix.fimotransfer.controllers;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import main.artfix.fimotransfer.services.FileDownloadService;
import main.artfix.fimotransfer.services.FileUploadService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
@RequiredArgsConstructor
public class FileController {

    private final FileUploadService fileUploadService;
    private final FileDownloadService fileDownloadService;

    @RequestMapping("/upload")
    public String uploadPage(@RequestParam("fileWrite") MultipartFile file, Model model) {
        try {
            fileUploadService.uploadFile(file);
            model.addAttribute("uploadMessage", "Upload success. Your download Code: "
                    + fileUploadService.userCode + ".");
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("uploadMessage", "We have an Error.");
        }
        return "/home";
    }

    @GetMapping("/download")
    public void downloadFile(@RequestParam("fileNameDownload") String fileName,
                             HttpServletResponse responseController, Model model) {
        try {
            fileDownloadService.downloadFile(responseController, fileName);
            model.addAttribute("downloadMessage", "Download success.");
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("downloadMessage", "We have an error: " + e.getMessage());
        }
    }

}

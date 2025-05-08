package main.artfix.fimotransfer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String homeMainPage() {
        return "/home";
    }

    @GetMapping("/home")
    public String homeHomePage() {
        return "/home";
    }
}

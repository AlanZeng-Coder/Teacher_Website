package com.example.teacherwebsite.controller;

import com.example.teacherwebsite.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {
    @Autowired
    private EmailService emailService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/submit-email")
    public String submitEmail(@RequestParam("email") String email, Model model) {
        emailService.saveEmail(email);
        model.addAttribute("message", "Email submitted successfully!");
        return "index";
    }
}

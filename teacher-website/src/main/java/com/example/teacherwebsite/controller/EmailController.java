package com.example.teacherwebsite.controller;

import com.example.teacherwebsite.entity.Email;
import com.example.teacherwebsite.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class EmailController {
    @Autowired
    private EmailService emailService;

    @GetMapping("/")
    public String index(Model model) {
        List<Email> emails = emailService.getAllEmails();
        model.addAttribute("emails", emails);
        return "index";
    }

    @PostMapping("/submit-email")
    public String submitEmail(@RequestParam("email") String email, Model model) {
        emailService.saveEmail(email);
        model.addAttribute("message", "Email submitted successfully!");
        return "index";
    }
}

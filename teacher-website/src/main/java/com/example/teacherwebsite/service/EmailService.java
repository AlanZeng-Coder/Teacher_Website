package com.example.teacherwebsite.service;

import com.example.teacherwebsite.entity.Email;
import com.example.teacherwebsite.mapper.EmailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService {
    @Autowired
    private EmailMapper emailMapper;

    public void saveEmail(String email) {
        Email emailEntity = new Email();
        emailEntity.setEmail(email);
        emailMapper.insertEmail(emailEntity);
    }

    public List<Email> getAllEmails() {
        return emailMapper.getAllEmails();
    }
}

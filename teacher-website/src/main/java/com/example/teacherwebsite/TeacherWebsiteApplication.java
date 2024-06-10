package com.example.teacherwebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.example.teacherwebsite.mapper")
public class TeacherWebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeacherWebsiteApplication.class, args);
    }

}

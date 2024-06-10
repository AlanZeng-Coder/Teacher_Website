package com.example.teacherwebsite.mapper;

import com.example.teacherwebsite.entity.Email;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmailMapper {
    @Insert("INSERT INTO emails (email) VALUES (#{email})")
    void insertEmail(Email email);

    @Select("SELECT * FROM emails")
    List<Email> getAllEmails();
}

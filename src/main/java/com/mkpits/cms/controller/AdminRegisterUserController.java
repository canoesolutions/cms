package com.mkpits.cms.controller;

import com.mkpits.cms.dto.StudentDto;
import com.mkpits.cms.service.StudentRegistrationService;
import com.mkpits.cms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminRegisterUserController {

    @Autowired
    StudentRegistrationService studentRegistrationService;

    @PostMapping("/register-user")
    public String registerUser(@ModelAttribute("student") StudentDto student) {
        studentRegistrationService.registerUser(student);
        return "redirect:/";
    }

}

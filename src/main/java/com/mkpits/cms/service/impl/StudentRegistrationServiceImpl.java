package com.mkpits.cms.service.impl;

import com.mkpits.cms.dto.StudentDto;
import com.mkpits.cms.model.Student;
import com.mkpits.cms.repo.StudentRepo;
import com.mkpits.cms.service.StudentRegistrationService;
import com.mkpits.cms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService {

    @Autowired
    StudentRepo studentRepo;

    @Override
    public StudentDto registerUser(StudentDto studentDto) {
        Student student = Student.builder()
                .firstName(studentDto.getFName())
                .lastName(studentDto.getLName())
                .email(studentDto.getEmail())
                .mobile(studentDto.getMobile())
                .status("DRAFT")
                .build();
        Student afterSave = studentRepo.save(student);
        studentDto.setId(afterSave.getId());
        return studentDto;
    }
}

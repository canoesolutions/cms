package com.mkpits.cms.service.impl;

import com.mkpits.cms.dto.StudentDto;
import com.mkpits.cms.model.Student;
import com.mkpits.cms.repo.StudentRepo;
import com.mkpits.cms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepo studentRepo;

    @Override
    public List<StudentDto> getAllStudent() {
        List<StudentDto> studentDtoList = new ArrayList<>();
        List<Student> studentList = studentRepo.findAll();
        studentList.stream().forEach(student -> {
            StudentDto studentDto = StudentDto.builder()
                    .id(student.getId())
                    .fName(student.getFirstName())
                    .lName(student.getLastName())
                    .email(student.getEmail())
                    .mobile(student.getMobile())
                    .status(student.getStatus())
                    .build();
            studentDtoList.add(studentDto);
        });
        return studentDtoList;
    }
}

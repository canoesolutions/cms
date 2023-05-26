package com.mkpits.cms.service.impl;

import com.mkpits.cms.dto.StudentDto;
import com.mkpits.cms.service.StudentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentListHardCodesServiceImpl implements StudentService {


    @Override
    public List<StudentDto> getAllStudent() {
        List<StudentDto> studentDtoList = new ArrayList<>();
        StudentDto studentDto1 = StudentDto.builder()
                .id(1L)
                .fName("Gati Krishna")
                .lName("Meher")
                .email("gatimeher@gmail.com")
                .mobile("9975610065")
                .status("PENDING")
                .build();
        StudentDto studentDto2 = StudentDto.builder()
                .id(2L)
                .fName("Mukta Rani")
                .lName("Meher")
                .email("mehermukta1@gmail.com")
                .mobile("9975610007")
                .status("DRAFT")
                .build();
        StudentDto studentDto3 = StudentDto.builder()
                .id(3L)
                .fName("Rishika")
                .lName("Meher")
                .email("rishikameher@gmail.com")
                .mobile("7588226611")
                .status("APPROVED")
                .build();
        StudentDto studentDto4 = StudentDto.builder()
                .id(4L)
                .fName("Rheana")
                .lName("Meher")
                .email("rheanameher@gmail.com")
                .mobile("9975610065")
                .status("APPROVED")
                .build();
        studentDtoList.add(studentDto1);
        studentDtoList.add(studentDto2);
        studentDtoList.add(studentDto3);
        studentDtoList.add(studentDto4);
        return studentDtoList;
    }
}

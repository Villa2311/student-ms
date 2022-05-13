package com.cointick.sms.service.impl;

import com.cointick.sms.model.Student;
import com.cointick.sms.repository.StudentRepository;
import com.cointick.sms.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentServiceImpl() {
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}

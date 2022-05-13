package com.cointick.sms.service;

import com.cointick.sms.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudent();
}

package com.cointick.sms.controller;

import com.cointick.sms.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("students")
    public String listOfStudents(Model model){
        model.addAttribute("students", studentService.getAllStudent());
        return "students";
    }
}

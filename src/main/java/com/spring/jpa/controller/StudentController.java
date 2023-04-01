package com.spring.jpa.controller;

import com.spring.jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/")
    public String getIndexPage(Model model){
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }

}

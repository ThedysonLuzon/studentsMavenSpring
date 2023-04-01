package com.spring.jpa.controller;

import com.spring.jpa.model.Student;
import com.spring.jpa.repository.StudentRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller

public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/")
    public String getIndexPage(Model model){
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String getAddStudentForm(Student student){
        return "add-student";
    }
    @PostMapping("/add")
    public String insertStudentData(@Valid Student student, BindingResult bindingResult, Model model){

        studentRepository.save(student);
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id")int id, Model model){
        Student student = studentRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("Invalid Student ID" + id));
        studentRepository.delete(student);
        model.addAttribute("students",studentRepository.findAll());
        return "index";
    }

    @GetMapping("/update/{id}")
    public String moveToUpdateEmployeePage(@PathVariable("id")int id, Model model){
        Student student = studentRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("Invalid Employee ID" + id));
        model.addAttribute("student",student);
        return "update-student";
    }

    @PostMapping("/update/{id}")
    public String updateEmployee(@PathVariable("id")int id,@Valid Student student,BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            student.setId(id);
            return "update-employee";
        }
        studentRepository.save(student);
        model.addAttribute("students",studentRepository.findAll());
        return "index";
    }


}

package com.spring.jpa.controller;

import com.spring.jpa.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProgramController {
    @Autowired
    private ProgramRepository programRepository;

    @RequestMapping("/programs")
    public String getProgramsPage(Model model){
        model.addAttribute("programs", programRepository.findAll());
        return "programlist";
    }
}

package com.example.demo.controller;

import com.example.demo.model.HelpAndSupport;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/helpandsupport")
public class HelpAndSupportController{

            @GetMapping
            public String show_register(Model model){
                model.addAttribute("help",new HelpAndSupport());
                return "helpandsupport";
            }
    @PostMapping
    public String processRegister(@Valid HelpAndSupport help, Errors errors) {
        if (errors.hasErrors()) {
            return "register";
        }

        return "redirect:/";
    }
}



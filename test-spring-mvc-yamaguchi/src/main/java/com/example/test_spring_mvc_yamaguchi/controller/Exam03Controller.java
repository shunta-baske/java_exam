package com.example.test_spring_mvc_yamaguchi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller


@RequestMapping("/exam03")
public class Exam03Controller {

    @RequestMapping("")
    public String request(){
        return "name-form";
    }

    @RequestMapping("res")
    public String res(){
        return "finished";
    }
}

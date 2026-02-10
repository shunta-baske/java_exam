package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.exam02Form;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

    @Autowired
    private HttpSession session;
    @ModelAttribute
    public exam02Form exam02Form(){
        return new exam02Form();
    }

    @RequestMapping("")
    public String index(){
        return "exam02";
    }

    @RequestMapping("/input")
    public String input(exam02Form form){
        exam02Form user = new exam02Form();
        int total = form.getNum1() + form.getNum2();
        System.out.println(total);
        user.setNum1(form.getNum1());
        user.setNum2(form.getNum2());
        session.setAttribute("num", user);

        return "exam02-result";
    }

    // @RequestMapping("/input")
    // public void input(String num1,String num2){
    //     System.out.println(num1+num2);
    //     return "exam02-result";
    // }


    @RequestMapping("/output")
    public String output(){
        return "exam02-result2";
    }
}

package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex01")
public class Thymleaf_controller {

    @RequestMapping("")
    public String index(){
        return "ex-thymeleaf-input";
    }

    @RequestMapping("/input")
    public String input(Model model,String name,Integer age,String hobby1,String hobby2,String hobby3,String hobby4){
        List<String>list=new ArrayList<>();
        list.add(hobby1);
        list.add(hobby2);
        list.add(hobby3);
        // list.add(hobby4);
        if (age<20) {
            model.addAttribute("ageCheck","未成年");
        }else{
            model.addAttribute("ageCheck","成人");
        }
        model.addAttribute("name",name);
        model.addAttribute("age", age);
        model.addAttribute("list",list);
        model.addAttribute("hobby3",hobby3);
        return "ex-thymeleaf-result";
    }
}

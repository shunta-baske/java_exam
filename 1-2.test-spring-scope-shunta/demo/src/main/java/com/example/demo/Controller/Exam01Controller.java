package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/exam01")
public class Exam01Controller {

    @RequestMapping("")
    public String inex(){
        return "exam01";
    }

    @RequestMapping("/input")
    public String input(String mailaddres,String password,Model model){
        if (mailaddres.equals("yamada@sample.com") && password.equals("yamayama")) {
            model.addAttribute("result","成功");
        }else{
            model.addAttribute("result","失敗");
        }
        return "exam01-result";
    }

}

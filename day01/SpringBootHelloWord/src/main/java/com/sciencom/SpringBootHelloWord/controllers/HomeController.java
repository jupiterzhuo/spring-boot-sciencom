package com.sciencom.SpringBootHelloWord.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by jupiterzhuo on 22/04/19.
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String Hello(Model model){
        model.addAttribute("name","my Template");

        return "Home";
    }
}

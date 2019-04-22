package com.sciencom.SpringBootHelloWord.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jupiterzhuo on 22/04/19.
 */
@RestController
public class StudentController {
    @GetMapping("api/student")
    public String get_student(){
        return "Hello From Rest Controller 1234";
    }
}

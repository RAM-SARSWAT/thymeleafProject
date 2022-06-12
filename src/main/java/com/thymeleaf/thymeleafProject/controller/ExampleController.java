package com.thymeleaf.thymeleafProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/th")
public class ExampleController {

    @GetMapping("/example")
    public String example(){
        return "example";
    }
}

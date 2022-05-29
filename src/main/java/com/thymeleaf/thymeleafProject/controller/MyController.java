package com.thymeleaf.thymeleafProject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/th")
public class MyController {

Logger logger=LoggerFactory.getLogger(MyController.class);

     @GetMapping(value = "/index")
    public String index(Model model){
         model.addAttribute("name","Ram Saraswat");
         model.addAttribute("date", LocalDate.now());
        logger.info("inside the index method...");
        return "index";
    }

    @GetMapping(value = "/iterate")
    public String iteratorHandler(Model model){
        List<String> list=new ArrayList<>();
        list.add("Ram");
        list.add("Dev");
        list.add("Laxmi");
        list.add("Komal");
        list.add("Preeti");
        list.add("Prince");
        model.addAttribute("list",list);
         return "iterate";
    }

    @GetMapping(value = "/getCondition")
    public String conditionalHandler(Model model){
         model.addAttribute("isActive",true);
        model.addAttribute("isInactive",false);
        model.addAttribute("gender","F");
       // model.addAttribute("gender","F");
        List<String> list=new ArrayList<>();
        model.addAttribute("name",list);
        return "conditional";
    }

    @GetMapping(value = "/fragment")
    public String fragment(Model model){
         model.addAttribute("title","Dynamic Fragment");
         model.addAttribute("subTitle","Data comes from Controller");
       return "service";
    }
}

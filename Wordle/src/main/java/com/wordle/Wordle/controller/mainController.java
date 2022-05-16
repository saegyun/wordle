package com.wordle.Wordle.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mainController {
    @PostMapping("/test")
    public String test(@RequestParam("test") String name){
        System.out.println(name);
        return "redirect:index.html";
    }
}

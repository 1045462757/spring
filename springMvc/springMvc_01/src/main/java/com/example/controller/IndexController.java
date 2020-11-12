package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(path = "/hello")
    public String Hello() {
        System.out.println("Hello World");
        return "success";
    }
}

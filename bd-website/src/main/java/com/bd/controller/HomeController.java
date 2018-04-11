package com.bd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* @author jrss
* */
@Controller()
public class HomeController {
    @RequestMapping("/")
    public String index()
    {
        return "redirect:index.html";
    }
}

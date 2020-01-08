package com.jmy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/index.html")
    public String index() {
        return "index";
    }

    @RequestMapping("/1")
    public String index1() {
        return "index1";
    }

    @RequestMapping("/archive.html")
    public String archive() {
        return "archive";
    }

    @RequestMapping("/contact.html")
    public String contact() {
        return "contact";
    }

    @RequestMapping("/single.html")
    public String single() {
        return "single";
    }

    @RequestMapping("")
    public String home() {
        return "index";
    }
}
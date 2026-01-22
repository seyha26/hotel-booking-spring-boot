package com.hotelbookingsystem.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class PageController {
    @GetMapping("/") 
    public String home() {
        return "index";
    }
    @GetMapping("/about-us") 
    public String about() {
        return "about-us";
    }
    @GetMapping("/blog") 
    public String blog() {
        return "blog";
    }
    @GetMapping("/main") 
    public String main() {
        return "main";
    }
    @GetMapping("/rooms") 
    public String rooms() {
        return "rooms";
    }
    @GetMapping("/room-details") 
    public String roomDetials() {
        return "room-details";
    }
    @GetMapping("/blog-details") 
    public String blogDetails() {
        return "blog-details";
    }
    @GetMapping("/contact") 
    public String contact() {
        return "contact";
    }
}
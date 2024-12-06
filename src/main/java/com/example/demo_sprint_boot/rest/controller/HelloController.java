package com.example.demo_sprint_boot.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hola polluela hermosa, espero que este teniendo un hermoso día. Te amo <3";
    }
}

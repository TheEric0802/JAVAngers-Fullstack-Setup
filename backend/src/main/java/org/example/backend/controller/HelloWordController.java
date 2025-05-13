package org.example.backend.controller;

import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/hello")
public class HelloWordController {

    @GetMapping
    public String hello() {
        return "Hello World";
    }
}

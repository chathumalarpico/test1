package com.chathumal.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TestController {
    @GetMapping
    public String test1() {
        return "Application is  version 0.0.1 "+LocalDateTime.now();
    }

}

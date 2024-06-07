package com.mediaflowtrace.demo.authmenegement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthController {


    @GetMapping("/auth/login")
    public String login(@RequestParam String param) {
        return new String();
    }
    
    
}

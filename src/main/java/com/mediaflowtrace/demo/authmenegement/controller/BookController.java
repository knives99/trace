package com.mediaflowtrace.demo.authmenegement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {


    @GetMapping("/books")
    public String getBooks(@RequestParam String param) {
        return new String();
    }

    @PostMapping("/books")
    public String postBooks(@RequestParam String param) {
        return new String();
    }
    
    
}

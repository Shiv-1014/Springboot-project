package com.org.springboot.pkg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserinfoController {
   @GetMapping("/user/{name}")
    public String getUserName(@PathVariable String name){
        return "Welcome to springboot  project" +name;
    }
}

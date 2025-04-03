package com.ivoyant.SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller2 {

    @GetMapping("/api")
    public String testPoint(){
        return "This is test End point";
    }

    @GetMapping("/api2")
    public String testPoint2(){
        return "This is test point 2";
    }
}

package com.nhnacademy.hellospringprofile2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CustomController {

    @Value("${test.name}")
    String val;

    @GetMapping
    public String index(){

        return val;
    }

}

package com.example.testappheruku.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRest {
    @GetMapping(path = "/")
    public String bonjour(){
        return "Bonjour enao , Bonjour ty !";
    }
}

package com.example.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class MyRestController {

    @GetMapping("/hello")
    @CrossOrigin(origins = "http://localhost:5174")
    public String[] getHello() {
        String[] messages = {"Breda", "Eindhoven", "Denbosch"};
        return messages;
    }
}
package com.example.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
@RestController
public class MyRestController {

    @GetMapping("/hello")
    @CrossOrigin(origins = "http://localhost:5173")
    public String getHello() {
        String[] messages = {"Hello", "World", "from Spring Boot!"};
        return "{ \"message1\": \"" + messages[0] + "\", \"message2\": \"" + messages[1] + "\", \"message3\": \"" + messages[2] + "\" }";
    }
}
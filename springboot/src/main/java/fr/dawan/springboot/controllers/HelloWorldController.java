package fr.dawan.springboot.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
    @Value("${msg:defaultmessage}")
    private String message;
    
    @GetMapping("/hello")
    public String helloWorld() {
        return message + " !";
    }

}

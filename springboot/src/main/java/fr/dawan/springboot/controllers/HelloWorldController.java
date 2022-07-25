package fr.dawan.springboot.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Value("${app.msg}")
    private String message;

    @GetMapping("/")
    public String helloWorld() {
        return message + " !";
    }
}

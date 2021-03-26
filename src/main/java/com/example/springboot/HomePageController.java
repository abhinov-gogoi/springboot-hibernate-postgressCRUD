package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {

    @RequestMapping("/")
    public String showWelcome() {
        return "Welcome to SPRING-Hibernate-RestAPI CRUD example project";
    }
}

package com.tothenew.RESTful_A2.Q1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeBeanController {

    @GetMapping(path="/welcome")
    public WelcomeBean welcomeBean(){
        return new WelcomeBean("Welcome to Spring Boot");
    }

}
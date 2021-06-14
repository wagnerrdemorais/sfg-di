package com.wagnerrmorais.springdependencyinjection.controllers;

import com.wagnerrmorais.springdependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHi(){
        return greetingService.sayGreeting();
    }
}

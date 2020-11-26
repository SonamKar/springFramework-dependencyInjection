package com.springframework.dependencyinjection.controllers;

import com.springframework.dependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryBeanController {
    private final GreetingService greetingService;
    PrimaryBeanController(GreetingService greetingService){
        this.greetingService=greetingService;
    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}

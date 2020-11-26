package com.springframework.dependencyinjection.controllers;

import com.springframework.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;
    ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService){
        this.greetingService=greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}

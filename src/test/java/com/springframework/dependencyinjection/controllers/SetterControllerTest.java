package com.springframework.dependencyinjection.controllers;

import com.springframework.dependencyinjection.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterControllerTest {
    SetterController setterController;
    @BeforeEach
    void setUp() {
        setterController=new SetterController();
        setterController.setGreetingService(new ConstructorInjectedGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(setterController.getGreeting());
    }
}
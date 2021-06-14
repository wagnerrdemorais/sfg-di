package com.wagnerrmorais.springdependencyinjection.controllers;

import com.wagnerrmorais.springdependencyinjection.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void setGreetingService() {
        System.out.println(controller.getGreeting());
    }
}
package com.wagnerrmorais.springdependencyinjection.services;

public class SetterInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello Hey Hi Oi Olá -- Setter";
    }
}

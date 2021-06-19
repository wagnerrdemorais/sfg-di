package com.wagnerrmorais.springdependencyinjection.services;

public class PropertyInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Hey Hi Oi Olá -- Property";
    }
}

package com.wagnerrmorais.springdependencyinjection.services;

public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Hey Hi Oi Olá -- Constructor";
    }
}

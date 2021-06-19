package com.wagnerrmorais.springdependencyinjection.services;

public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Hey Hi Oi Olá -- From the Primary Bean";
    }
}

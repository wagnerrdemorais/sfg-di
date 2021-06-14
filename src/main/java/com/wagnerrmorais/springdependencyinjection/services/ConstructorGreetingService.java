package com.wagnerrmorais.springdependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Hey Hi Oi Olá -- Constructor";
    }
}

package com.wagnerrmorais.springdependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Hey Hi Oi Olá -- From the Primary Bean";
    }
}

package com.wagnerrmorais.springdependencyinjection.services;

public class I18NSpanishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
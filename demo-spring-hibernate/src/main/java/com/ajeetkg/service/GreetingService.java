package com.ajeetkg.service;

import org.springframework.stereotype.Service;

import com.ajeetkg.model.Greeting;

@Service
public class GreetingService {
    public Greeting getGreeting(String name){
        Greeting greeting = new Greeting();
        greeting.setId(1);
        greeting.setMessage(name + " is very intelligent");
        return greeting;
    }
}

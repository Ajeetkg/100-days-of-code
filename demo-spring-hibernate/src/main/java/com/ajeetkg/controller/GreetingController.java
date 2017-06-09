package com.ajeetkg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ajeetkg.model.Greeting;
import com.ajeetkg.service.GreetingService;

/**
 * Created by agupta2 on 6/8/17.
 */

@RestController
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @RequestMapping(value = "/greeting")
    public Greeting getGreeting(@RequestParam(value ="name") String name){
        return greetingService.getGreeting(name);
    }
}

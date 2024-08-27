package com.springboot.learn.coolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //expose '/' and return hello world!
    @GetMapping("/")
    public String sayHello (){
        return  "Hello World!";
    }

    //Expose a new endpoint 'workout'
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 2k!";
    }

    //Expose a new endpoint 'fortune'
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day!";
    }

}

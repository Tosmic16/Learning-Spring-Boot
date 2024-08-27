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
}

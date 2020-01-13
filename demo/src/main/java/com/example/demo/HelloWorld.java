package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping("/")
    public String index(){
        return "Hello World";
    }
    @PostMapping("/Suma")
    public Integer suma(Integer num){
        int res;
        res = num*(num+1)/2;
        return res;
    }
}

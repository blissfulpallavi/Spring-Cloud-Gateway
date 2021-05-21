package com.pallavi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consumer")
public class ConsumerApi {

    @GetMapping("/message")
    public String test(){
        return "Hello all! Called in consumer Service";
    }

}

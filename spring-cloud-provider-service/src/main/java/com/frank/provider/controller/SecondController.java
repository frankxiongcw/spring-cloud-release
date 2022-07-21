package com.frank.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SecondController {

    @RequestMapping("/say")
    public String firstSay(){
        return "Second Time";
    }
}

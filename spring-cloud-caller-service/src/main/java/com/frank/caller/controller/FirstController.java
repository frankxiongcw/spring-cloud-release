package com.frank.caller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstController {

    @RequestMapping("/say")
    public String firstSay(){
        return "First Time";
    }
}

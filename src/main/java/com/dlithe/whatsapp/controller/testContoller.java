package com.dlithe.whatsapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testContoller {


    @GetMapping("test")
    public String myFirstMethod(){
        return "**hi hello welcome to Springboot world**";
    }

}

package com.dlithe.whatsapp.controller;

import com.dlithe.whatsapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

@Autowired
private TestService testService;



@GetMapping("fetchDetails/{productName}")
    public String test(@PathVariable String productName){
    return testService.fetchProductDetails(productName);


    }




}


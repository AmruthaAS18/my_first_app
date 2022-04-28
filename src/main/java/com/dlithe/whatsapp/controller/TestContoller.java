package com.dlithe.whatsapp.controller;

import com.dlithe.whatsapp.dto.BankingUsersDetailsRequest;
import com.dlithe.whatsapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContoller {

    @Autowired
    private TestService testService;


    @GetMapping("test")
    public String myFirstMethod(){
        return "**hi hello welcome to Springboot world**";
    }

    @PostMapping("banking-user")
    public String userRegister(@RequestBody  BankingUsersDetailsRequest bankingUsersDetailsRequest){
        return testService.regisiterUsers(bankingUsersDetailsRequest);
    }

}

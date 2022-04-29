package com.dlithe.whatsapp.controller;

import com.dlithe.whatsapp.dto.BankingUsersDetailsResponse;
import com.dlithe.whatsapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestContoller {

    @Autowired
    private TestService testService;


    @GetMapping("test")
    public String myFirstMethod(){
        return "**hi hello welcome to Springboot world**";
    }

    @PostMapping("banking-user")
    public String userRegister(@RequestBody BankingUsersDetailsResponse bankingUsersDetailsResponse){
        return testService.regisiterUsers(bankingUsersDetailsResponse);
    }

    @GetMapping("get-user-details/{userId}")
        public BankingUsersDetailsResponse getUserDetails(@PathVariable int userId){
        return testService.detailsOfUsers(userId);
    }

}

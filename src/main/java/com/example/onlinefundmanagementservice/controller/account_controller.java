package com.example.onlinefundmanagementservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.onlinefundmanagementservice.model.account_model;
import com.example.onlinefundmanagementservice.service.account_serviceI;

@RestController
@EnableAutoConfiguration
@RequestMapping("account/account")
public class account_controller {

    @Autowired
    private account_serviceI accountServiceI;

    @PostMapping
    public ResponseEntity<?> saveAccount(@RequestBody account_model accountModel){
        if (accountServiceI.findByNumber(accountModel.getNumber()) != null){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(accountServiceI.saveAccount(accountModel), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllAccounts(){
        return  ResponseEntity.ok(accountServiceI.findAll());
    }
}

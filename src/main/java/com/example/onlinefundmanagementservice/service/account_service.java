package com.example.onlinefundmanagementservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.onlinefundmanagementservice.repo.account_repo;
import com.example.onlinefundmanagementservice.model.account_model;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class account_service implements account_serviceI{

    @Autowired
    private account_repo accountRepo;

    @Override
    public account_model saveAccount(account_model accountModel){
        accountModel.setDate(LocalDateTime.now());
        return accountRepo.save(accountModel);
    }

    @Override
    public account_model findByNumber(int number){
        return accountRepo.findByNumber(number).orElse(null);
    }

    @Override
    public List<account_model> findAll(){
        return accountRepo.findAll();
    }
}

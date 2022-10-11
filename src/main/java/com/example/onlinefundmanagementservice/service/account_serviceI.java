package com.example.onlinefundmanagementservice.service;

import com.example.onlinefundmanagementservice.model.account_model;
import org.springframework.stereotype.Service;

import java.util.List;

public interface account_serviceI {
    account_model saveAccount(account_model accountModel);

    account_model findByNumber(int number);

    List<account_model> findAll();
}

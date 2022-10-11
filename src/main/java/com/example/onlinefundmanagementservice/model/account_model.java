package com.example.onlinefundmanagementservice.model;

import javax.persistence.Entity;

@Entity
public class account_model {

    public account_model(){
    }

    private String id;
    private String type;
    private Integer number;
    private String name;
    private Integer balance;
    private String date;

    public account_model(String id, String type, Integer number, String name, Integer balance, String date) {
        this.id = id;
        this.type = type;
        this.number = number;
        this.name = name;
        this.balance = balance;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNumber() {return number;}

    public void setNumber(Integer number) {this.number = number;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}

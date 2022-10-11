package com.example.onlinefundmanagementservice.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "accounts")

public class account_model {

    public account_model(){
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "account type")
    private String type;
    @Column(name = "account number")
    private Integer number;
    @Column(name = "account name")
    private String name;
    @Column(name = "balance")
    private Integer balance;
    @Column(name = "date")
    private LocalDateTime date;

    public account_model(int id, String type, Integer number, String name, Integer balance, LocalDateTime date) {
        this.id = id;
        this.type = type;
        this.number = number;
        this.name = name;
        this.balance = balance;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

}

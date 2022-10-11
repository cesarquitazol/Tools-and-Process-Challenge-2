package com.example.onlinefundmanagementservice.service;

import com.example.onlinefundmanagementservice.model.person_model;
import com.example.onlinefundmanagementservice.repo.person_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class person_service implements person_serviceI{
    @Autowired
    private person_repo personRepo;

    @Override
    public person_model savePerson(person_model personModel){
        personModel.setName(personModel.getName());
        return personRepo.save(personModel);
    }

    @Override
    public person_model findByName(String name){
        return personRepo.findByName(name).orElse(null);
    }

    @Override
    public List<person_model> findAll(){
        return personRepo.findAll();
    }
}

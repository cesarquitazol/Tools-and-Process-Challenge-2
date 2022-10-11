package com.example.onlinefundmanagementservice.controller;

import com.example.onlinefundmanagementservice.model.person_model;
import com.example.onlinefundmanagementservice.service.person_serviceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@RequestMapping("person/person")
public class person_controller {

    @Autowired
    private person_serviceI personServiceI;

    @PostMapping
    public ResponseEntity<?> savePerson(@RequestBody person_model personModel) {
        if (personServiceI.findByName(personModel.getName()) != null) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(personServiceI.savePerson(personModel), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllPersons() {
        return ResponseEntity.ok(personServiceI.findAll());
    }
}
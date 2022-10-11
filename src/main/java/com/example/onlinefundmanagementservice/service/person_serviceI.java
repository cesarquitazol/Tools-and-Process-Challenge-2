package com.example.onlinefundmanagementservice.service;

import com.example.onlinefundmanagementservice.model.person_model;
import org.springframework.stereotype.Service;

import java.util.List;

public interface person_serviceI {
    person_model savePerson(person_model personModel);

    person_model findByName(String name);

    List<person_model> findAll();
}

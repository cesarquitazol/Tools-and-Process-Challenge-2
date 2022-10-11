package com.example.onlinefundmanagementservice.repo;

import com.example.onlinefundmanagementservice.model.person_model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface person_repo extends JpaRepository<person_model, Long> {
    Optional<person_model> findByName(String name);
}

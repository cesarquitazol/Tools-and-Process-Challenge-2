package com.example.onlinefundmanagementservice.repo;

import com.example.onlinefundmanagementservice.model.account_model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface account_repo extends JpaRepository<account_model, Long> {

    Optional<account_model> findByNumber(int number);
}

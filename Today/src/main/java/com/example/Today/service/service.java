package com.example.Today.service;


import com.example.Today.Repo.repo;
import com.example.Today.entity.entity;

import org.springframework.stereotype.Service;

@Service
public class service {

    private final repo userRepository;

    public service(repo userRepository) {
        this.userRepository = userRepository;
    }

    public entity saveUser(entity user) {
        return userRepository.save(user);
    }
}


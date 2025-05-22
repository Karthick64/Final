package com.example.Today.controller;


import com.example.Today.entity.entity;
import com.example.Today.service.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/api/use")
public class Controller {

    private final service userService;

    public Controller(service userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<entity> createUser(@RequestBody entity user) {
        entity savedUser = userService.saveUser(user);
        return ResponseEntity.ok(savedUser);
    }
}


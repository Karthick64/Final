package com.example.Today.Repo;


import com.example.Today.entity.entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repo extends JpaRepository<entity, Long> {
}


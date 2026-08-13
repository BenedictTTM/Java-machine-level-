package com.example.demo.service;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class DatabaseService {
    @PersistenceContext
    private EntityManager entitymanager ;

    @PostConstruct
    public void TestDataBaseConnection (){
    try {
        entitymanager.createNativeQuery("SELECT 1").getSingleResult();
        System.out.println("I think the ...");
    }catch (Exception e){
        System.out.println("well  think the ...");
    };
    };
};

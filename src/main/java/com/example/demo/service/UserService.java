package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;

import com.example.demo.model.*;

import java.util.*;


@Service
public class UserService {
    
    private final UserRepository userRepository ;
    
    public UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers (){
      
      List<User> users = userRepository.findAll();
      String userInfo = users.toString();
        System.out.println(userInfo);
        return users;
    };


}

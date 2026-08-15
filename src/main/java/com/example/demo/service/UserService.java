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

    public String getUser(Long id){
        Optional<User> user = userRepository.findById(id);
        String printUser = user.toString();
         System.out.println(printUser);
       if(user.isEmpty()){
        return "No user found";
       }else{
        return "User found with ID"+id;
       }
    }

    public User addUser(User user) {

        User singleUser = userRepository.save(user);
        System.out.println("What was returned: " + singleUser);
        return singleUser;
    }


    public String delUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()) {
            return "User with ID: " + id + " not found";
        } else {
            userRepository.delete(user.get());
            return "User with ID: " + id + " deleted successfully";
        }
    }
}

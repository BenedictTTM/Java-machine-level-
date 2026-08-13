package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.UserService;
import com.example.demo.model.User;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    
    public UserController( UserService userService){
     this.userService = userService;
    }

   
    @GetMapping
    public List <User> getAllUsers(){
        return userService.getAllUsers();
    }
}

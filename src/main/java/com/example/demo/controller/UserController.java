package com.example.demo.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.UserService;
import com.example.demo.model.User;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



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
    

    @GetMapping("/{id}")
    public String  getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id){
        return userService.delUser(id);
    }
}

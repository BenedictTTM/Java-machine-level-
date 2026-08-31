package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;

@RestController
@RequestMapping("/location")
public class LocationController {
    private final UserService userService;
    public LocationController( UserService userService){
    this.userService = userService;
    }

@GetMapping
public String getUser(@PathVariable Long id){
    return userService.getUser(id);
}

}

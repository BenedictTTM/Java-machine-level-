package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Location;
import com.example.demo.service.LocationService;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/location")
public class LocationController {
    private final LocationService locationService;
    public LocationController( LocationService locationService){
    this.locationService = locationService;
    }


@PostMapping
public Location postUser (@RequestBody Location location){
    return locationService.addLocation(location);
}

@GetMapping("/{id}")
public String getLocation (@PathVariable  Long id ){
    return locationService.userLocation(id);
}
}
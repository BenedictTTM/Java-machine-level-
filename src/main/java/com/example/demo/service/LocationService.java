package com.example.demo.service;
import com.example.demo.model.Location;
import java.util.*;
import org.springframework.stereotype.Service;
import com.example.demo.repository.LocationRepository;


@Service
public class LocationService{
    private final LocationRepository locationRepository;
    public LocationService(LocationRepository locationRepository){
      this.locationRepository = locationRepository;
    }

    public String userLocation (Long id){
     Optional<Location> location = locationRepository.findById(id);
     
     if (location.isPresent()){
      return location.get().getCountry();
     }
     else {
      return "Location not found";
     }
    }

    public Location addLocation (Location location){
      Location userLocation = locationRepository.save(location);
      System.out.println("This is the new location "+ userLocation.toString());
      return userLocation;
    }
}

package com.example.demo.Controller;

import com.example.demo.Entities.Vehicle;
import com.example.demo.service.VehicleManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    private VehicleManager vehicleManager;

    @GetMapping("/vehicles")
    public List<Vehicle> getVehicles() {
        return vehicleManager.getAllVehicles();
    }

    @PostMapping("/vehicles")
    public String createVehicle(@RequestBody Vehicle vehicle) {
        return vehicleManager.addVehicle(vehicle);
    }
}
package com.example.demo.Interfaces;

import com.example.demo.Entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository <Vehicle,String> {
}

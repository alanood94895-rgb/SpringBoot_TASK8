package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String vehicleId;
    private String vehicleModel;
    private double rentalPricePerDay;


    @Override
    public String toString() {
        return vehicleId + "  " + vehicleModel + " " + rentalPricePerDay + " OMR/day";
    }

}

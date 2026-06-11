package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vehicle extends ParentEntity{

    private String vehicleModel;
    private Double rentalPricePerDay;
    @OneToOne
    Employee employee;
}
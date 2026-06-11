package com.example.demo.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Employee extends ParentEntity {
    private String employeeName;
    private String department;
    @OneToMany
    private List<Vehicle> vehicles;
}
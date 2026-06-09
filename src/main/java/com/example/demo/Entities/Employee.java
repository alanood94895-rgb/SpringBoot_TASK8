package com.example.demo.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private String employeeId;
    private String employeeName;
    private String department;

    @Override
    public String toString() {
        return employeeId + "  " + employeeName + "  " + department;
    }

    @OneToMany
    List <Campaign> campaigns;

    @OneToMany
    List <Vehicle> vehicles;

}

package com.example.demo.Entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private String employeeId;
    private String employeeName;
    private String department;

    public Employee(String employeeId, String employeeName, String department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return employeeId + "  " + employeeName + "  " + department;
    }
    @OneToMany
    List <Campaign> campaigns;

    @OneToMany
    List <Vehicle> vehicles;

}

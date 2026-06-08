package com.example.demo.service;

import com.example.demo.Entities.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        employees.add(new Employee("E101", "Sara", "HR"));
        employees.add(new Employee("E102", "Ahmed", "Finance"));
        employees.add(new Employee("E103", "John", "Sales"));
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public void addEmployee(Employee newEmployee) {

        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(newEmployee.getEmployeeId())) {
                System.out.println("\nEmployee ID already exists");
                System.out.println("No employee was created");
                return;
            }
        }
}

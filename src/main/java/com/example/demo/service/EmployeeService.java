package com.example.demo.service;

import com.example.demo.Entities.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        employees.add(new Employee("E101", "Sara", "HR",new ArrayList<>(),new ArrayList<>()));
        employees.add(new Employee("E102", "Ahmed", "Finance",new ArrayList<>(),new ArrayList<>()));
        employees.add(new Employee("E103", "John", "Sales",new ArrayList<>(),new ArrayList<>()));
    }

    public List <Employee> displayEmployees() {
        return employees;
    }

    public String addEmployee(Employee newEmployee) {

        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(newEmployee.getEmployeeId())) {
                System.out.println("\nEmployee ID already exists");
                System.out.println("No employee was created");

            }
        }
        employees.add(newEmployee);

        System.out.println("\nEmployee Added Successfully");
        System.out.println("Employee ID: " + newEmployee.getEmployeeId());
        System.out.println("Employee Name: " + newEmployee.getEmployeeName());
        System.out.println("Department: " + newEmployee.getDepartment());
        System.out.println("Status: Created");

        return "Add Successfully";
    }

}

package com.example.demo;

import com.example.demo.Entities.Employee;
import com.example.demo.service.EmployeeService;

import java.util.ArrayList;

public class EmployeePostDemo {
        public static void main(String[] args) {

            EmployeeService service = new EmployeeService();

            System.out.println("Existing Employees");
            service.displayEmployees();

            Employee newEmployee =
                    new Employee("E104", "Ali", "IT",new ArrayList<>(),new ArrayList<>());

            service.addEmployee(newEmployee);

            System.out.println("\nFinal Employee List");
            service.displayEmployees();
        }

}

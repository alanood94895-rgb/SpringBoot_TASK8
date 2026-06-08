package com.example.demo;

import com.example.demo.Entities.Employee;
import com.example.demo.service.EmployeeService;

public class EmployeePostDemo {
        public static void main(String[] args) {

            EmployeeService service = new EmployeeService();

            System.out.println("Existing Employees");
            service.displayEmployees();

            Employee newEmployee =
                    new Employee("E104", "Ali", "IT");

            service.addEmployee(newEmployee);

            System.out.println("\nFinal Employee List");
            service.displayEmployees();
        }

}

package com.example.demo.Interfaces;

import com.example.demo.Entities.Campaign;
import com.example.demo.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,String> {
}

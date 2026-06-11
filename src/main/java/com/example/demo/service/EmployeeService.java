package com.example.demo.service;

import com.example.demo.Entities.Employee;
import com.example.demo.Interfaces.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee getById(Integer id) {
        return employeeRepository.getById(id);
    }

    public Employee getByName(String name) {
        return employeeRepository.getByName(name);
    }

    public Employee save(Employee employee){
        employee.setCreationDate(new Date());
        employee.setIsActive(true);
        return employeeRepository.save(employee);
    }

    public List<Employee> getAll(){
        return employeeRepository.getAll();
    }

    public Employee update(Integer id, Employee newEmployee) throws Exception {
        Employee emp = employeeRepository.getById(id);
        if(emp != null){
            emp.setEmployeeName(newEmployee.getEmployeeName());
            emp.setDepartment(newEmployee.getDepartment());
            emp.setUpdateDate(new Date());
            return employeeRepository.save(emp);
        }
        throw new Exception("Employee Cannot be Null!");

    }

    public Boolean delete(Integer id) {
        Employee employee = employeeRepository.getById(id);
        if(employee != null){
            employee.setIsActive(false);
            employee.setUpdateDate(new Date());
            employeeRepository.save(employee);
            return true;
        }
        return false;
    }



}
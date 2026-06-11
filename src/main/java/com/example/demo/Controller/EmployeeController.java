package com.example.demo.Controller;

import com.example.demo.Entities.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("add")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);

    }

    @GetMapping("getAll")
    public List<Employee> displayEmployee(){
        return employeeService.getAll();
    }

    @GetMapping("getById/{Id}")
    public Employee getById(@PathVariable Integer id){
        return employeeService.getById(id);
    }

    @GetMapping("getByName/{name}")
    public Employee getByName(@PathVariable String name){
        return employeeService.getByName(name);
    }

    @PutMapping("updateEmployee/{id}")
    public Employee update(@PathVariable Integer id, @RequestBody Employee employee) throws Exception{
        return employeeService.update(id, employee);
    }

    @DeleteMapping("deleteEmployee/{id}")
    public String delete(@PathVariable Integer id) {
        employeeService.delete(id);
        return "Deleted!";
    }
}
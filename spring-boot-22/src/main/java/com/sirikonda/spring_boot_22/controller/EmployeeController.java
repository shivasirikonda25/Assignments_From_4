package com.sirikonda.spring_boot_22.controller;

import com.sirikonda.spring_boot_22.model.Employee;
import com.sirikonda.spring_boot_22.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController
{
    @Autowired
    EmployeeService esv;
    @PostMapping("/employees")
        public Employee create(@RequestBody Employee employee)
        {
            return esv.create(employee);
        }
        @GetMapping("/get")
    public List<Employee> findAll()
        {
            return esv.findAll();
        }
        @GetMapping("/get/{id}")
    public Employee findById(@PathVariable long id)
        {
           return esv.getEmployeeById(id);
        }
        @PutMapping("/get/{id}")
    public Employee updateById(long id ,@RequestBody Employee emp)
        {
            return esv.updateEmployee(id,emp);
        }
        @DeleteMapping("/get/{id}")
    public void deleteById(@PathVariable long id)
        {
            esv.deleteById(id);
        }
}

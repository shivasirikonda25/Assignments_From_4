package com.sirikonda.spring_boot_22.service;

import com.sirikonda.spring_boot_22.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService
{
    public Employee create(Employee employee);
    public Employee getEmployeeById(long id);
    public List<Employee> findAll();
    public Employee updateEmployee(long id,Employee emp);
}

package com.sirikonda.spring_boot_22.service;

import com.sirikonda.spring_boot_22.model.Employee;
import com.sirikonda.spring_boot_22.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService
{
@Autowired
EmployeeRepository resp;
    @Override
    public Employee create(Employee employee)
    {
        return resp.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
       return resp.findById(id).get();
    }

    @Override
    public List<Employee> findAll() {
        return resp.findAll();
    }

    @Override
    public Employee updateEmployee(long id, Employee emp)
    {
       Employee e=resp.findById(id).get();
       e.setId(emp.getId());
       e.setSalary(emp.getSalary());
       e.setDepartment(emp.getDepartment());
       e.setFirstname(emp.getFirstname());
       e.setLastname(emp.getLastname());
       return resp.save(e);
    }

    @Override
    public void deleteById(long id) {
        resp.deleteById(id);
    }

}

package com.sirikonda.spring_boot_22.repository;

import com.sirikonda.spring_boot_22.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>
{

}

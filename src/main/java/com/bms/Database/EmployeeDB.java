package com.bms.Database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bms.Models.Employee;

public interface EmployeeDB extends JpaRepository<Employee, Integer>
{
    List<Employee> findByName(String name);
    void deleteByName(String name);
    
}

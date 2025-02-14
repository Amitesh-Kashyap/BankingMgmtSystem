package com.bms.Database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bms.Models.Customer;

public interface CustomerDB extends JpaRepository<Customer, Integer>
{
    List<Customer> findByName(String name);
    void deleteByName(String name);
}

package com.bms.Database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bms.Models.Loan;

@Repository
public interface LoanDB extends JpaRepository<Loan , Integer>
{
    // No need to define any methods here as JpaRepository already provides all the basic CRUD operations.
    // Only custom ones here
    List<Loan> findByUserID(String userID);
    
}

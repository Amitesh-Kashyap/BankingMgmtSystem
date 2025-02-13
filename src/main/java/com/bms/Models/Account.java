package com.bms.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "USERS")
public class Account
{
    @Id
    private String accountID;
    // Can also write @Column(name = "Acc Numbers")
    private String accountNumber;
    private String accountType;

    public Account()
    {
        // Default constructor for Hibernate
    }

    public Account(String accountID, String accountNumber, String accountType)
    {
        this.accountID = accountID;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }
}

package com.bms.Models;

import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class Customer extends User
{
    private List<Account> ob;
    public Customer( String name, String email, String password, String phone, String address , List<Account> accounts)
    {
        super(name, email, password, phone, address);
        for (Account account : accounts)
        {
            ob.add(account);            
        }

    }
}

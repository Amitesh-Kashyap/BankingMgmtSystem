package com.bms.Models;

import jakarta.persistence.Entity;

@Entity
public class Customer extends User
{
    private Account ob;
}

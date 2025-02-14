package com.bms.Models;

import java.util.List;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public abstract class User
{
    @Id
    private String ID;
    private String name;
    private String email;
    private String password;
    private String address;

    public User(String id , String name , String email , String password , String address)
    {
        this.ID = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
    }
}

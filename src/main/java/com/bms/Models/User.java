package com.bms.Models;

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
}

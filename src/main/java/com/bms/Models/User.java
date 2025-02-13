package com.bms.Models;

import lombok.Data;

@Data
public abstract class User
{
    private String ID;
    private String name;
    private String email;
    private String password;
    private String address;
}

package com.bms.Handlers;

public class UserDoesNotExist extends RuntimeException
{
    public UserDoesNotExist(String message)
    {
        super(message);
    }
}
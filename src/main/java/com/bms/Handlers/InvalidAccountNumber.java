package com.bms.Handlers;

public class InvalidAccountNumber extends RuntimeException
{
    public InvalidAccountNumber(String message)
    {
        super(message);
    }
}
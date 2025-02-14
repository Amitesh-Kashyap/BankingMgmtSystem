package com.bms.Handlers;

public class GoingBeyondLimit extends RuntimeException
{
    public GoingBeyondLimit(String message)
    {
        super(message);
    }
}
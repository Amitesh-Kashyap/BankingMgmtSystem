package com.bms.Handlers;

class InsufficentBalance extends RuntimeException
{
    public InsufficentBalance(String message)
    {
        super(message);
    }
}

class UserDoesNotExist extends RuntimeException
{
    public UserDoesNotExist(String message)
    {
        super(message);
    }
}

class InvalidAccountNumber extends RuntimeException
{
    public InvalidAccountNumber(String message)
    {
        super(message);
    }
}

class GoingBeyondLimit extends RuntimeException
{
    public GoingBeyondLimit(String message)
    {
        super(message);
    }
}

public class CustomExceptions
{
    
}

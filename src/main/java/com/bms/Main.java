package com.bms;

import com.bms.Handlers.CustomExceptions;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Great to meet you!");
        throw new InsufficentBalance("Great");
    }
}
package com.bms.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Transact
{
    // Transaction type : Withdraw Transfer Deposit use enum instead of hard coding in Constants
    @Id
    private String ID;
    private String senderID;
    private String receiverID;
    private float amount;
}

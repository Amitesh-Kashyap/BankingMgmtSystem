package com.bms.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Loans Sanctioned")
@Data
public class Loan
{
    @Id
    String loanId;
    String userID;
    String loanAmount;
    String loanTenure;
    String loanStatus;    
}

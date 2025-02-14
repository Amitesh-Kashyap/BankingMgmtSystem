package com.bms.Database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bms.Models.Transact;
import com.bms.Models.Constants.AllConstants;

public interface TransactionDB extends JpaRepository<Transact , Integer>
{
    List<Transact> findBySenderID(String senderID);
    List<Transact> findByReceiverID(String receiverID);
    List<Transact> findByTransactionType( AllConstants.TransactionType type);

    void deleteBySenderID(String senderID);
    void deleteByReceiverID(String senderID);
    // find by ID will already be there    
}

package com.bms.Database;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bms.Models.Account;

@Repository
public interface AccountDB extends JpaRepository<Account , Integer>
{
    // @Override
    // default <S extends Account> List<S> saveAll(Iterable<S> entities) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    // }
    Optional<Account> findByAccountNumber(String accountNumber);
    List<Account> saveAll(List<Account> accounts);
    
}

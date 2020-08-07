package com.example.demo.service;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService implements AccountServiceInterface {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public ResponseEntity<?> login(Account sentAccount) {

        Optional<Account> fetchedAcc = accountRepository.findById(sentAccount.getUserName());


        System.out.println(fetchedAcc.get().getPassWord());
        System.out.println(sentAccount.getPassWord());

        //Very ihopklåpat men fungerar hehe ;)
        if ((fetchedAcc.get().getPassWord()).equals(sentAccount.getPassWord()))
            //lyckad login
            return new ResponseEntity<>(sentAccount, HttpStatus.OK);
        else
            //misslyckad login
            return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
    }

    // TODO: 2020-08-07 implemmentera sessionsgrejsimojs med logout
    @Override
    public ResponseEntity<?> logout() {
        return null;
    }

    // TODO: 2020-08-07 implementera sessionsgrejsimojs
    @Override
    public ResponseEntity<?> isauth() {
        return null;
    }

    @Override
    public Account register(Account account) {
        accountRepository.save(account);
        return account;
    }

    @Override
    public List<Account> fetchAllAccounts() {
        return accountRepository.findAll();
    }

}

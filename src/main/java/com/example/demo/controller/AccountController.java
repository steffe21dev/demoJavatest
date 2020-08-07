package com.example.demo.controller;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;


    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody Account account){
        return accountService.login(account);
    }

    @PutMapping("/logout")
    public ResponseEntity<?> logout(@Valid @RequestBody Account account){
        return accountService.login(account);
    }


    //Skapa konto för testning
    @PostMapping("/account")
    public Account createUser(@Valid @RequestBody Account account) {
        return accountService.register(account);
    }


    @GetMapping("/accounts")
    public List<Account> getAccounts() {
        return accountService.fetchAllAccounts();
    }
}

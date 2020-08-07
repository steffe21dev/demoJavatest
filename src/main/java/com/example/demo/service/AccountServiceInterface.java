package com.example.demo.service;

import com.example.demo.model.Account;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AccountServiceInterface {

    ResponseEntity<?> login(Account sentAccount);

    ResponseEntity<?> logout();

    ResponseEntity<?> isauth();

    Account register(Account account);

    List<Account> fetchAllAccounts();


}

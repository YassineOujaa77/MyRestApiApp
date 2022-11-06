package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v0/transaction")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @GetMapping
    public Transaction getTransaction(@RequestParam int id  ){

        return transactionService.getTransactions().get(id);

    }

    @GetMapping
    public List<Transaction> getAllTransactions(){
        return transactionService.getTransactions();
    }




}

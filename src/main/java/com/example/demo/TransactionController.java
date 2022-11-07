package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @GetMapping("api/v0/transactions/{id}")
    public Transaction getTransaction(@PathVariable int id  ){

        return transactionService.getTransactions().get(id);

    }

    @GetMapping("api/v0/transactions")
    public List<Transaction> getAllTransactions(){
        return transactionService.getTransactions();
    }


    public void hello(){
        System.out.println("hello ");
    }

}

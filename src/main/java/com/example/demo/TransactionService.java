package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    public List<Transaction> getTransactions(){
        List<Transaction> transactions = new ArrayList<>();

        transactions.add(new Transaction(0,"name0","150","15/12/22"));
        transactions.add(new Transaction(1,"name1","2000","15/03/22"));
        transactions.add(new Transaction(2,"name2","1771","10/07/22"));
        transactions.add(new Transaction(3,"name3","1400","11/03/22"));
        transactions.add(new Transaction(4,"name4","12","17/02/22"));
        transactions.add(new Transaction(5,"name5","13","12/02/22"));

        return transactions;

    }

}

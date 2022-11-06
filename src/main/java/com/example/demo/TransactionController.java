package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @GetMapping("/Transaction")
    public Transaction getTransaction(@RequestParam String id  ){

        return new Transaction(1,"nametest","150","15/12/20");
    }


}

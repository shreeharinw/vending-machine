package com.pluto.app.service;

import com.pluto.app.model.Transaction;

public class TransactionService {

    public double initializeTransaction() {
        return new Transaction().getId();
    }

    public double closeTransaction(int id) {
        return id;
    }
}

package com.pluto.app.model;

public class Transaction {

    private double id;
    private int walletAmount;

    public Transaction() {
        id = Math.random();
    }

    public int getWalletAmount() {
        return walletAmount;
    }

    public void setWalletAmount(int walletAmount) {
        this.walletAmount = walletAmount;
    }

    public double getId() {
        return id;
    }
}

package com.pluto.app.service;


import com.pluto.app.model.Transaction;
import com.pluto.app.model.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineService {
    

    /**
     * Re-initalizes a vending machine
     */
    public void resetVendingMachine() {
        VendingMachine vendingMachine = VendingMachine.getInstance().reset();
    }
    /**
     * Returns true if correct password as that of vendor password
     * @param password
     * @return
     */
    public boolean loginAsVendor(String password) {
        return true;
    }

    /**
     * Returns a list of allowed operations
     * @return
     */
    public List<String> getOperations(boolean isAdmin) {
        return new ArrayList<>();
    }
    /**
     * Put the vending machine in maintenance mode, no consumer can use it
     */
    public void startMaintenanceMode() {
        VendingMachine.getInstance().setInMaintenance(true);
    }

    /**
     * Fill a numer of items in
     * TODO throw an error if items are already added to slot and the id is different
     * also
     * @param row
     * @param col
     * @param itemId
     * @param itemCount
     */
    public void addToSlot(int row, int col, int itemId, int itemCount) {

    }

    /**
     * calculate total amount collected for a given time range
     * @param fromDate
     * @param toDate
     */
    public void calculateVMSales(int fromDate, int toDate) {

    }

    /**
     * calculate sales for a given item in a given time range
     * @param itemId
     * @param fromDate
     * @param toDate
     */
    public void calculateItemSales(int itemId, int fromDate, int toDate) {

    }
    /**
     * A consumer has triggered a transaction
     */
    public Transaction initalizeTransaction() {
        return new Transaction();
    }



}

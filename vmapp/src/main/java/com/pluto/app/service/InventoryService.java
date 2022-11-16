package com.pluto.app.service;

import com.pluto.app.model.Inventory;
import com.pluto.app.model.Item;

public class InventoryService {
    public void addItem(String name, int price) {
        Inventory.getInstance().getItemNames().add(new Item(name, price).getName());
    }
}

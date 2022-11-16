package com.pluto.app.model;

import java.util.HashSet;
import java.util.Set;

public class Inventory {

    private static Inventory instance;

    private Set<String> itemNames = new HashSet<>();

    public static Inventory getInstance() {
        if (instance == null) {
            instance = new Inventory();
        }
        return instance;
    }


    public Set<String> getItemNames() {
        return itemNames;
    }
}

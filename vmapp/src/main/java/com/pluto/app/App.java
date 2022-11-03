package com.pluto.app;

import com.pluto.app.machines.SingleItemVendingMachine;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Item<Integer>> items = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Item<Integer> item = new Item<>(((Integer) i).toString());
            items.add(item);
        }

        SingleItemVendingMachine<Integer> machine = new SingleItemVendingMachine<>();
        machine.fill(items);

        for (int i = 0; i < 8; i++) {
            System.out.println(machine.vend());
        }
    }
}

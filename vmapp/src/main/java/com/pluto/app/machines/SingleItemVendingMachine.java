package com.pluto.app.machines;

import com.pluto.app.Item;

import java.util.*;

public class SingleItemVendingMachine<ItemType> {

    private final Stack<Item<ItemType>> items = new Stack<>();

    // TODO : not everyone should be able to fill the machine, find a way so only vendor can fill machine even tough
    //  fill method is public
    public void fill(List<Item<ItemType>> items) {
        Iterator<Item<ItemType>> iterator = items.listIterator();
        while (iterator.hasNext()) {
            this.items.add(iterator.next());
            iterator.remove();
        }
    }

    public Item<ItemType> vend() {
        if (!this.items.isEmpty()) {
            return this.items.pop();
        } else {
            throw new NoSuchElementException("Vending machine is empty!");
        }
    }
}

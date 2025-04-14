package com.shmormius.items;

public class Inventory {
    private final int MAX_CAPACITY = 10;

    private int inventoryCapacity;
    private Item[] inventory;
    private int heldItems;
    
    public Inventory(){
        inventoryCapacity = 3;
        inventory = new Item[3];
        heldItems = 0;
    }

    public int getCapacity(){
        return inventoryCapacity;
    }

    public int getBurden(){
        return heldItems;
    }
}

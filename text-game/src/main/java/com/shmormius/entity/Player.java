package com.shmormius.entity;

import com.shmormius.items.Inventory;

public class Player extends StandUser{
    Inventory inventory = new Inventory();
    
    public Player(){
        super();
        inventory = new Inventory();
    }

    public Inventory getInventory(){
        return inventory;
    }
}

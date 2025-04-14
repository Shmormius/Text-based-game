package com.shmormius.entity;

import com.shmormius.items.Inventory;

public class Player extends StandUser{
    Inventory inventory;
    double moneyValue;
    
    public Player(){
        super();
        inventory = new Inventory();
        moneyValue = 10.0;
    }

    public Inventory getInventory(){
        return inventory;
    }

    public double getMoneyValue(){
        return Double.valueOf(moneyValue);
    }
}

package com.shmormius.entity;

public class GameEntity {
    
    private double health;
    private String name;
    private EntityStatus status;
    
    public GameEntity(){
        health = 100.0;
        name = "No Name";
        status = EntityStatus.ALIVE;
    }

    public double getHealthValue(){
        return Double.valueOf(health);
    }

    public String getName(){
        return String.valueOf(name);
    }

    public EntityStatus getStatus(){
        return status;
    }
}

package com.shmormius.entity;

public class GameEntity {
    
    private double health;
    private String name;
    private EntityStatus status;
    private StatValue power;
    private StatValue speed;
    private StatValue potential;
    private StatValue range;
    private StatValue precision;
    private StatValue durability;
    
    public GameEntity(){
        health = 100.0;
        name = "No Name";
        status = EntityStatus.ALIVE;
        power = StatValue.E;
        speed = StatValue.E;
        potential = StatValue.E;
        range = StatValue.E;
        precision = StatValue.E;
        durability = StatValue.E;
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

    public StatValue getPower(){
        return power;
    }

    public StatValue getRange(){
        return range;
    }

    public StatValue getPrecision(){
        return precision;
    }

    public StatValue getPotential(){
        return potential;
    }

    public StatValue getSpeed(){
        return speed;
    }

    public StatValue getDurability(){
        return durability;
    }
}

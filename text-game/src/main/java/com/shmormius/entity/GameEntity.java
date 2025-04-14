package com.shmormius.entity;

public class GameEntity {
    final private double MAX_HEALTH = 1000;
    
    private double health;
    private double maxHealth;
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
        maxHealth = health;

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

    public void setPower(StatValue power){
        this.power = power;
    }

    public void setRange(StatValue range){
        this.range = range;
    }

    public void setPrecision(StatValue precision){
        this.precision = precision;
    }

    public void setPotential(StatValue potential){
        this.potential = potential;
    }

    public void setSpeed(StatValue speed){
        this.speed = speed;
    }

    public void setDurability(StatValue durability){
        this.durability = durability;
    }

    private void setStatus(EntityStatus newStatus){
        status = newStatus;
    }

    public void takeDamage(double damageAmount){
        health = health - damageAmount;

        if(health <= 0){
            setStatus(EntityStatus.DEAD);
        }
    }

    public void increaseMaxHealth(double increaseAmount){
        maxHealth = maxHealth + increaseAmount;

        if(maxHealth > MAX_HEALTH){
            maxHealth = MAX_HEALTH;
        }
    }

    public void heal(double amountToHeal){
        health = health + amountToHeal;

        if(health > maxHealth){
            health = maxHealth;
        }
    }
}

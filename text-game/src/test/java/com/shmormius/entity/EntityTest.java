package com.shmormius.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EntityTest {

    GameEntity newEntity = new GameEntity();

    @Test
    public void entityDefaultConstructorTest(){
        assertEquals(newEntity.getName(), "No Name");
        assertEquals(newEntity.getHealthValue(), 100);
        assertEquals(newEntity.getStatus(),EntityStatus.ALIVE);
        assertEquals(newEntity.getSpeed(), StatValue.E);
        assertEquals(newEntity.getRange(), StatValue.E);
        assertEquals(newEntity.getPotential(), StatValue.E);
        assertEquals(newEntity.getPrecision(), StatValue.E);
        assertEquals(newEntity.getPower(), StatValue.E);
        assertEquals(newEntity.getDurability(), StatValue.E);
    }

    @Test
    public void killDefaultEntity(){
        newEntity.takeDamage(100);

        assertEquals(newEntity.getStatus(),EntityStatus.DEAD);
        assertEquals(newEntity.getHealthValue(), 0);
    }

    @Test
    public void damageNotKillEntity(){
        newEntity.takeDamage(50);

        assertEquals(newEntity.getStatus(),EntityStatus.ALIVE);
        assertEquals(newEntity.getHealthValue(), 50);
    }

    @Test
    public void healBelowMax(){
        newEntity.increaseMaxHealth(50);

        newEntity.heal(49);

        assertEquals(newEntity.getHealthValue(), 149);
    }

    @Test
    public void healFromDamage(){
        newEntity.takeDamage(50);

        newEntity.heal(49);

        assertEquals(newEntity.getHealthValue(), 99);
    }

    @Test
    public void healAboveMax(){
        newEntity.heal(50);

        assertEquals(newEntity.getHealthValue(), 100);
    }

    @Test
    public void increaseAboveMax(){
        newEntity.increaseMaxHealth(1050);
        newEntity.heal(1000);
        
        assertEquals(newEntity.getHealthValue(), 1000);
    }

    @Test
    public void testSetPower(){
        newEntity.setPower(StatValue.A);
        
        assertEquals(newEntity.getPower(), StatValue.A);
    }

    @Test
    public void testSetSpeed(){
        newEntity.setSpeed(StatValue.A);
        
        assertEquals(newEntity.getSpeed(), StatValue.A);
    }

    @Test
    public void testSetPotential(){
        newEntity.setPotential(StatValue.A);
        
        assertEquals(newEntity.getPotential(), StatValue.A);
    }

    @Test
    public void testSetDurability(){
        newEntity.setDurability(StatValue.A);
        
        assertEquals(newEntity.getDurability(), StatValue.A);
    }

    @Test
    public void testSetRange(){
        newEntity.setRange(StatValue.A);
        
        assertEquals(newEntity.getRange(), StatValue.A);
    }

    @Test
    public void testSetPrecision(){
        newEntity.setPrecision(StatValue.A);
        
        assertEquals(newEntity.getPrecision(), StatValue.A);
    }
}

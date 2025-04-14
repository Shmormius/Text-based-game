package com.shmormius.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PlayerTest {
    Player playerDefault = new Player();

    @Test
    public void entityDefaultConstructorTest(){
        assertEquals(playerDefault.getName(), "No Name");
        assertEquals(playerDefault.getHealthValue(), 100);
        assertEquals(playerDefault.getStatus(),EntityStatus.ALIVE);
        assertEquals(playerDefault.getSpeed(), StatValue.E);
        assertEquals(playerDefault.getRange(), StatValue.E);
        assertEquals(playerDefault.getPotential(), StatValue.E);
        assertEquals(playerDefault.getPrecision(), StatValue.E);
        assertEquals(playerDefault.getPower(), StatValue.E);
        assertEquals(playerDefault.getDurability(), StatValue.E);
        assertEquals(playerDefault.getStandName(), "No Name");
        assertEquals(playerDefault.getStandAbility().toString(), "No Special Ability");
        assertEquals(playerDefault.getInventory().getBurden(), 0);
    }
}

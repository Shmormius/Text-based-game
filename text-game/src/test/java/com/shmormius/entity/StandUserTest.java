package com.shmormius.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StandUserTest {
    StandUser defaultStandUser = new StandUser();

    @Test
    public void entityDefaultConstructorTest(){
        assertEquals(defaultStandUser.getName(), "No Name");
        assertEquals(defaultStandUser.getHealthValue(), 100);
        assertEquals(defaultStandUser.getStatus(),EntityStatus.ALIVE);
        assertEquals(defaultStandUser.getSpeed(), StatValue.E);
        assertEquals(defaultStandUser.getRange(), StatValue.E);
        assertEquals(defaultStandUser.getPotential(), StatValue.E);
        assertEquals(defaultStandUser.getPrecision(), StatValue.E);
        assertEquals(defaultStandUser.getPower(), StatValue.E);
        assertEquals(defaultStandUser.getDurability(), StatValue.E);
        assertEquals(defaultStandUser.getStandName(), "No Name");
        assertEquals(defaultStandUser.getStandAbility().toString(), "No Special Ability");
    }
}

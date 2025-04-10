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
}

package com.shmormius.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EntityTest {

    @Test
    public void entityDefaultConstructorTest(){
        GameEntity newEntity = new GameEntity();

        assertEquals(newEntity.getName(), "No Name");
        assertEquals(newEntity.getHealthValue(), 100);
        assertEquals(newEntity.getStatus(),EntityStatus.ALIVE);
    }
}

package com.shmormius;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.shmormius.entity.Player;

public class InitializerTest {
    Player player;
    Initializer initializer = new Initializer();

    @Test
    public void testPlayerInitializer(){
        player = initializer.initializePlayer();
        assertEquals(player.getName(), "No Name");
    }
}

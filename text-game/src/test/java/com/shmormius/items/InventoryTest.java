package com.shmormius.items;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class InventoryTest {
    Inventory inventoryDefault = new Inventory();

    @Test
    public void getCapacityTest(){
        assertTrue(inventoryDefault.getCapacity() == 3);
    }
}

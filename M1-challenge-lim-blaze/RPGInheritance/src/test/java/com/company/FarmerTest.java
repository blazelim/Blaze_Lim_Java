package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {
    private Farmer steve;
    private Farmer evilRandy;

    @Before
    public void init() {
        steve = new Farmer("Steve");
        evilRandy = new Farmer("Randy");
    }

    @Test
    public void checkForInitialStats() {
        assertEquals("Steve", steve.getName());
        assertEquals(75, steve.getStrength());
        assertEquals(100, steve.getHealth());
        assertEquals(75, steve.getStamina());
        assertEquals(10, steve.getSpeed());
        assertEquals(1, steve.getAttackPower());
        assertFalse(steve.isRunning());
        assertFalse(steve.isArrested());
        assertFalse(steve.isPlowing());
        assertFalse(steve.isHarvesting());
    }

    @Test
    public void checkThatAttackingReducesHealth() {
        assertEquals(100,steve.getHealth());

        evilRandy.attack(steve);

        assertEquals(99, steve.getHealth());
    }

    @Test
    public void checkTogglePlowing() {
        assertFalse(steve.isPlowing());
        steve.togglePlowing();
        assertTrue(steve.isPlowing());
        steve.togglePlowing();
        assertFalse(steve.isPlowing());
    }

    @Test
    public void checkToggleHarvesting() {
        assertFalse(steve.isHarvesting());
        steve.toggleHarvesting();
        assertTrue(steve.isHarvesting());
        steve.toggleHarvesting();
        assertFalse(steve.isHarvesting());
    }

    @Test
    public void checkToggleRunning(){
        assertFalse(steve.isRunning());
        steve.toggleRunning();
        assertTrue(steve.isRunning());
        steve.toggleRunning();
        assertFalse(steve.isRunning());
    }
}
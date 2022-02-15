package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {
    private Farmer steve;
    private Warrior jones;
    private Warrior mark;

    @Before
    public void init() {
        steve = new Farmer("Steve");
        jones = new Warrior("Jones");
        mark = new Warrior("Mark");
    }

    @Test
    public void checkForInitialStats() {
        assertEquals("Mark", mark.getName());
        assertEquals(75, mark.getStrength());
        assertEquals(100, mark.getHealth());
        assertEquals(100, mark.getStamina());
        assertEquals(50, mark.getSpeed());
        assertEquals(10, mark.getAttackPower());
        assertEquals(100, mark.getShieldStrength());
        assertFalse(mark.isRunning());
        assertFalse(mark.isArrested());
    }

    @Test
    public void checkToggleRunning(){
        assertFalse(mark.isRunning());
        mark.toggleRunning();
        assertTrue(mark.isRunning());
        mark.toggleRunning();
        assertFalse(mark.isRunning());
    }

    @Test
    public void checkThatAttackingReducesHealth() {
        assertEquals(100,steve.getHealth());
        mark.attack(steve);
        assertEquals(90, steve.getHealth());
    }


    @Test
    public void checkThatGettingAttackedisLessOfAReduction() {
        assertEquals(100,mark.getHealth());
        assertEquals(100,steve.getHealth());
        jones.attack(steve);
        jones.attack(mark);
        assertEquals(91,mark.getHealth());
        assertEquals(90, steve.getHealth());
    }
}
package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {
    private Constable addison;
    private Farmer eli;

    @Before
    public void init() {
        addison = new Constable("Addison", "Texas");
        eli = new Farmer("Eli");
    }

    @Test
    public void checkForInitialStats() {
        assertEquals("Addison", addison.getName());
        assertEquals(60, addison.getStrength());
        assertEquals(100, addison.getHealth());
        assertEquals(60, addison.getStamina());
        assertEquals(20, addison.getSpeed());
        assertEquals(5, addison.getAttackPower());
        assertFalse(addison.isRunning());
        assertFalse(addison.isArrested());
        assertEquals("Texas", addison.getJurisdiction());
    }

    @Test
    public void checkToggleRunning(){
        assertFalse(addison.isRunning());
        addison.toggleRunning();
        assertTrue(addison.isRunning());
        addison.toggleRunning();
        assertFalse(addison.isRunning());
    }

    @Test
    public void checkThatAttackingReducesHealth() {
        assertEquals(100,eli.getHealth());
        addison.attack(eli);
        assertEquals(95, eli.getHealth());
    }

    @Test
    public void checkThatArrestingOtherWorks() {
        assertFalse(eli.isArrested());
        addison.arrest(eli);
        assertTrue(eli.isArrested());
    }
}
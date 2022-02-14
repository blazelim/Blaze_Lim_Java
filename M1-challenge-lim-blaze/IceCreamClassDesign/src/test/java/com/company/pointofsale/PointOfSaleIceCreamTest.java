package com.company.pointofsale;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointOfSaleIceCreamTest {
    private IceCream pointOfSale;

    @Before
    public void init() {
        pointOfSale = new IceCream("Cherry Garcia", 7.99, 40);
    }

    @Test
    public void getFlavorReturnsFlavor () {
        assertEquals(false, pointOfSale.getFlavor()=="cherry");
        assertEquals("Cherry Garcia", pointOfSale.getFlavor());
    }

    @Test
    public void getPriceReturnsPrice () {
        assertNotEquals(7.87, pointOfSale.getPrice(),.01);
        assertEquals(7.99,pointOfSale.getPrice(), .01);
    }

    @Test
    public void getQuantityReturnsQuantity() {
        assertNotEquals(60, pointOfSale.getQuantity());
        assertEquals(40, pointOfSale.getQuantity());
    }

    @Test
    public void settingNewFlavorReturnsNewFlavor () {
        assertEquals("Cherry Garcia", pointOfSale.getFlavor());
        pointOfSale.setFlavor("Peanut Butter");
        assertEquals("Peanut Butter", pointOfSale.getFlavor());
    }

    @Test
    public void settingNewPriceReturnsNewPrice () {
        assertNotEquals(8.99, pointOfSale.getPrice());
        pointOfSale.setPrice(8.99);
        assertEquals(8.99,pointOfSale.getPrice(),.01);
    }

    @Test
    public void settingNewQuantityReturnsNewQuantity() {
        assertNotEquals(39, pointOfSale.getQuantity());
        pointOfSale.setQuantity(39);
        assertEquals(39, pointOfSale.getQuantity());
    }
}
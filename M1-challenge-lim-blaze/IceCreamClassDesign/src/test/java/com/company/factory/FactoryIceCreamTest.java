package com.company.factory;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FactoryIceCreamTest {
    private List<String> ingredients;

    private com.company.factory.IceCream factory;

    @Before
    public void init() {
        ingredients = new ArrayList<>();
        ingredients.add("cherry");
        ingredients.add("cream");
        ingredients.add("sugar");

        factory = new IceCream(
                "Cherry Garcia",
                5.99,
                2.00,
                60,
                ingredients
        );
    }

    @Test
    public void gettingFlavorShouldReturnFlavor () {
        assertEquals("Cherry Garcia", factory.getFlavor());
    }

    @Test
    public void gettingSalesPriceShouldReturnSalesPrice() {
        assertEquals(5.99, factory.getSalePrice(),.01);
    }

    @Test
    public void gettingProductionCostShouldReturnProductionCost() {
        assertEquals(2.00,factory.getProductionCost(),.01);
    }

    @Test
    public void gettingProductionTimeShouldReturnProductionTime() {
        assertEquals(60,factory.getProductionTime());
    }

    @Test
    public void checkingForIngredientsShouldBeTrueOrFalse() {
        assertEquals(true, factory.getIngredients().contains("cherry"));
        assertEquals(true, factory.getIngredients().contains("cream"));
        assertEquals(true, factory.getIngredients().contains("sugar"));
        assertEquals(false, factory.getIngredients().contains("tomato"));
    }

    @Test
    public void settingFlavorToNewFlavorReturnsNewFlavor() {
        assertEquals("Cherry Garcia", factory.getFlavor());
        factory.setFlavor("PeanutButter");
        assertEquals("PeanutButter", factory.getFlavor());
    }

    @Test
    public void settingNewProductionCostReturnsNew() {
        assertEquals(2.00, factory.getProductionCost(),.01);
        factory.setProductionCost(2.50);
        assertEquals(2.50, factory.getProductionCost(),.01);
    }

    @Test
    public void settingNewProductionTimeReturnsNew() {
        assertEquals(60, factory.getProductionTime(), .01);
        factory.setProductionTime(40);
        assertEquals(40, factory.getProductionTime(),.01);
    }

    @Test
    public void addingNewIngredientTurnsFalseToTrue() {
        assertEquals(false, factory.getIngredients().contains("tomato"));
        List<String> newIngredients = factory.getIngredients();
        newIngredients.add("tomato");
        factory.setIngredients(newIngredients);
        assertEquals(true, factory.getIngredients().contains("tomato"));
    }
}
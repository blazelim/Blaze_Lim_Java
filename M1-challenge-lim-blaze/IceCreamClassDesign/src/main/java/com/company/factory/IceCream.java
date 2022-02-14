package com.company.factory;

import java.util.List;

public class IceCream {

    private String flavor;
    private double salePrice;
    private double productionCost;
    private int productionTime;
    private List<String> ingredients;

    public IceCream (String flavor, double salePrice, double productionCost, int productionTime, List<String> ingredients) {
        this.flavor = flavor;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
    }


    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public int getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(int productionTime) {
        this.productionTime = productionTime;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void addIngredients(String newIngredient) {
        this.ingredients.add(newIngredient);
    }
}
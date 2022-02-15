package com.company;

public class Farmer extends BaseClass {
    private boolean plowing;
    private boolean harvesting;

    public Farmer(String name) {
        super(name);
        this.plowing = false;
        this.harvesting = false;
        this.setStrength(75);
        this.setStamina(75);
    }

    public boolean isPlowing() {
        return plowing;
    }

    public void togglePlowing() {
        this.plowing = !this.plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void toggleHarvesting() {
        this.harvesting = !this.harvesting;
    }
}

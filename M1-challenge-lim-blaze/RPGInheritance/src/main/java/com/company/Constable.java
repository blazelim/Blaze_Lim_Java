package com.company;

public class Constable extends BaseClass{
    private String jurisdiction;

    public Constable(String name, String jurisdiction) {
        super(name);
        this.setAttackPower(5);
        this.setSpeed(20);

        this.jurisdiction = jurisdiction;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public void arrest(BaseClass other) {
        other.setArrested(true);
    }
}

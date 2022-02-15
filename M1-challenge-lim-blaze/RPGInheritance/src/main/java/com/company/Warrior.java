package com.company;

public class Warrior extends BaseClass {
    private int shieldStrength;
    public Warrior(String name) {
        super(name);
        this.setStrength(75);
        this.setStamina(100);
        this.setSpeed(50);
        this.setAttackPower(10);
        this.shieldStrength = 100;
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    // allow shieldpower to reduce damage taken
    @Override
    public void isAttacked(int attackDamage){

        int damageTaken = (attackDamage)- (this.shieldStrength/100);
        int newHealth = this.getHealth() - damageTaken;
        this.setHealth(newHealth);
    }
}

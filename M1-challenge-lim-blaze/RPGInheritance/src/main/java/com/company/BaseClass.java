package com.company;

public class BaseClass {
    private String name;
    private int strength;
    private int health;
    private int stamina;



    private int speed;
    private int attackPower;
    private boolean running;
    private boolean arrested;


    public BaseClass(String name) {
        this.name = name;
        this.strength = 60;
        this.health = 100;
        this.stamina = 60;
        this.speed = 10;
        this.attackPower = 1;
        this.running = false;
        this.arrested = false;
    }
    public String getName() {
        return name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isArrested() {
        return arrested;
    }

    public void setArrested(boolean arrested) {
        this.arrested = arrested;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void attack(BaseClass other) {
        other.isAttacked(this.attackPower);
    }

    public void isAttacked(int attackDamage){
        int newHealth = this.getHealth() - attackDamage;
        this.setHealth(newHealth);
    }

    public boolean isRunning() {
        return running;
    }

    public void toggleRunning() {
        this.running = !this.running;
    }
}

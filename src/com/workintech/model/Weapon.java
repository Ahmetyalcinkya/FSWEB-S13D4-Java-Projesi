package com.workintech.model;

public enum Weapon {
    KNIFE(100),
    M4A1S(53),
    AK47(70),
    AWP(107);

    private int damage;

    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

package com.company;

public class Hero {
    private int health;
    private int damage;
    private double skill;

    public Hero(int health, int damage, double skill) {
        this.damage = damage;//
        this.health = health;//
        this.skill = skill;

    }

    public int getHealth() {
        return health;
    }

    public int setHealth(int health) {
        this.health = health;

        return health;
    }

    public double getSkill() {
        return skill;

    }

    public double setSkill(double skill) {
        this.skill = skill;
        return skill;
    }

    public int getDamage() {
        return damage;

    }

    public int setDamage(int damage) {
        this.damage = damage;
        return damage;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(createHeroes());
    }
    public static Hero[] createHeroes() {
        Hero mage = new Hero(200,50,200+1);
        System.out.print("Mage's damage [" + mage.getDamage() + "]");
        System.out.print(", health " + " [" +  mage.getHealth() + "]"); // первый конструктор
        System.out.println(", critical damage " +  " [" + mage.getSkill() + "]");

        Hero archer = new Hero(300,30,88+1);
        System.out.print("Archer's damage [" + archer.getDamage() + "]");
        System.out.print(", health " + " [" +  archer.getHealth() + "]");
        System.out.println(", critical damage " +  " [" + archer.getSkill() + "]");

        Hero healer = new Hero(0,0,0);
        System.out.print("Healer's damage [" + healer.setDamage(10) + "]");
        System.out.print(", health " + " [" +  healer.setHealth(150) + "]");
        System.out.println(", critical damage " +  " [" + healer.setSkill(Math.random()*90) + "]"); //второй констркутор

        Hero[] heroes = {mage, archer, healer};//МАССИВ С ТИПОМ ДАННЫХ HERO[]

        return heroes;

    }
}

package org.example;

public  class Weapon extends Item {
    private int attack;



    public Weapon (int weapon,Rarity rarity, String name){
        super(name);
        this.attack = weapon;

    }
    public int getAttack() {
        return attack;}
}










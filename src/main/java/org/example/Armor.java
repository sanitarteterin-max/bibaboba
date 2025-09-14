package org.example;

public class Armor extends Item {
    private int deffence;

    public Armor(int armor, Rarity rarity, String name) {
        super(name);
        this.deffence = armor;

    }
    public int getDeffence(){return deffence;
    }






}


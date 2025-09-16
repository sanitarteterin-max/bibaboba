package org.example;

public class Unit{
    private int hp;
    private int deffence;
    private int attack;
    private String name;
    private Armor armor;
    private Weapon  weapon;

    // razdelenie
    public Unit(int hp, int deffence, int attack, String name ) {
        this.hp = hp;
        this.deffence = deffence;
        this.attack = attack;
        this.name = name;


    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDeffence() {
        return deffence;
    }

    public void lossHp(int damage) {
        int currenthp = hp - damage;
        hp = currenthp;

    }



    public int tichka(Unit pidor) {
        int damage = this.getFullattack() - pidor.getFullDeffence();
        return damage;


    }

    public Armor getArmor() {
       return armor;


    }
    public int getFullDeffence() {
        int armorDeffence;
        if (armor != null){
            armorDeffence = armor.getDeffence();
        } else{
           armorDeffence= 0;
        }
        return  deffence + armorDeffence;


    }
    public int getFullattack() {
        int weaponAttack;
        if (weapon != null){
         weaponAttack = weapon.getAttack();
        } else{
            weaponAttack= 0;
        }
        return  attack + weaponAttack;


    }
    public void Equip(Item item){
        if (item instanceof Weapon weapon) {
            this.weapon = weapon;
        }
        if (item instanceof Armor armor){
            this.armor = armor;
        }
    }





}





















package org.example;

import java.io.BufferedReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Unit semen = new Unit(50, 0, 15, "Semen");
        Unit vitaliy = new Unit(70, 6, 6, "Vitaliy");
        Weapon mech = new Weapon( 2, Rarity.RARE, "dermo"  );
        Weapon hui =new Weapon(3, Rarity.COMMON, "hui");
        Armor shit = new Armor( 1,Rarity.RARE, "shit" );
        semen.Equip(mech);
        vitaliy.Equip(shit);
        vitaliy.Equip(hui);
        semen.Equip(shit);



        int damage = semen.tichka(vitaliy);
        int damage2 = vitaliy.tichka(semen);
        for (int i= 1;(vitaliy.getHp() > 0) && (semen.getHp() > 0); i++) {
            System.out.println(i +" turn start ");
            if ((semen.getHp()>0)){
                vitaliy.lossHp(damage);
            }
            if (vitaliy.getHp()>0) {
                semen.lossHp(damage2);
            }
            System.out.println ();
            System.out.println(vitaliy.getHp() + " hp vitaliy");
            System.out.println(semen.getHp() + " hp semen");
            System.out.println ();
            if ((vitaliy.getHp()) <= 0) System.out.println("semen win");
            if ((semen.getHp()) <= 0) System.out.println("vitaliy win");


        }


    }


}





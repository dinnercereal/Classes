package org.vashonsd;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Wizard {
    int maxDamage;
    int health;
    int armor;
    int accuracy;
    ArrayList<String> spellsKnown;
    Random rand = new Random();

    public Wizard(int maxDamage, int health, int armor, int accuracy, ArrayList<String> spellsKnown) {
        this.maxDamage = maxDamage;
        this.health = health;
        this.armor = armor;
        this.accuracy = accuracy;
        this.spellsKnown = spellsKnown;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public ArrayList<String> getSpellsKnown() {
        return spellsKnown;
    }

    public void setSpellsKnown(ArrayList<String> spellsKnown) {
        this.spellsKnown = spellsKnown;
    }

    public int attack(){
        return rand.nextInt(maxDamage/2,maxDamage);
    }

    public void summonDragon(){
        Dragon wizardsDragon=new Dragon(Dragon.Color.BLUE, 30, 200, 21, 19);
    }
}

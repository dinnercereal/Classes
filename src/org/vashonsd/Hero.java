package org.vashonsd;

import java.util.ArrayList;
import java.util.Random;

public class Hero {
    String name;
    ArrayList<String> equipment;
    int maxDamage;
    int health;
    int armor;
    int accuracy;
    Random rand = new Random();

    public Hero(String name, ArrayList<String> equipment, int maxDamage, int health, int armor, int accuracy) {
        this.name = name;
        this.equipment = equipment;
        this.maxDamage = maxDamage;
        this.health = health;
        this.armor = armor;
        this.accuracy = accuracy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(ArrayList<String> equipment) {
        this.equipment = equipment;
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

    public void addEquipment(String newEquipment){
        equipment.add(newEquipment);
    }

    public int attack(){
        return rand.nextInt(maxDamage/2,maxDamage);
    }
}

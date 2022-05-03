package org.vashonsd;

import java.util.Random;

public class Dragon {
    Color color;
    int maxDamage;
    int health;
    int armor;
    int accuracy;
    Random rand = new Random();

    public Dragon(Color color, int maxDamage, int health, int armor, int accuracy){
        this.color=color;
        this.maxDamage=maxDamage;
        this.health=health;
        this.armor=armor;
        this.accuracy=accuracy;
    }

    public enum Color{
        RED,
        BLUE,
        GREEN,
        PURPLE,
        GOLD,
        BLACK,
        WHITE
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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

    public int getAccuracy(){
        return accuracy;
    }

    public void setAccuracy(int accuracy){
        this.accuracy=accuracy;
    }

    public void takeDamage(int damageIn, int accuracy){
        if(accuracy>armor){
            health-=damageIn;
        }
    }

    public int attack(){
        return rand.nextInt(maxDamage/2,maxDamage);
    }
}

package com.workintech.model;

public class Player {

    private String name ;
    private int healthPercentage ;

    private Weapon weapon ;

    private void checkHealthPercentage(int healthPercentage){
        if(healthPercentage > 100){
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }

    // constructor

    public Player(String name, int healthPercentage, Weapon weapon) {
        checkHealthPercentage(healthPercentage);
        this.name = name;
        this.weapon = weapon;
    }

    public int healthRemaining(){
        return healthPercentage;
    }
    public void loseHealth(int damage){

        int remaining = healthPercentage - damage;
        if(remaining <= 0) {
            System.out.println(name + " player has been knocked out of game!");
        }
        checkHealthPercentage(remaining);
    }

    public void restoreHealth(int healthPotion){
        int potionEffect = healthPercentage + healthPotion;
        if(potionEffect > 100){
            healthPercentage = 100;
        }
        checkHealthPercentage(healthPercentage + potionEffect);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}

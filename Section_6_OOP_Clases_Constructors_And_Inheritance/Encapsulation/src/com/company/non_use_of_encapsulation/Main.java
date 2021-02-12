package com.company.non_use_of_encapsulation;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
//        player.name = "Tim";
        player.fullName = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health " + player.healthRemaining());
    }
}

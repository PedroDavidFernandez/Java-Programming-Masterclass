package com.company.use_of_encapsulation;

public class Main {
    public static void main(String[] args) {
        EnhancedPlayer player = new EnhancedPlayer(
                "Pedro",
                    70,
                "Machine Gun"
        );
        System.out.println("Initial health is " + player.getPlayerHealth());
    }
}

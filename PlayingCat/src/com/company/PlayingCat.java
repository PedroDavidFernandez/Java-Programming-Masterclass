package com.company;

public class PlayingCat {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(true, 45));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer && (temperature < 25 || temperature > 45)) {
            return false;
        }

        if (!summer && (temperature < 25 || temperature > 35)) {
            return false;
        }
        return true;
    }
}

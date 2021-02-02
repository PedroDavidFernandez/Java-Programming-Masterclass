package com.company;

public class BarkingDog {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 1));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println(shouldWakeUp(true, 44));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking || (hourOfDay < 0 || hourOfDay > 24)) {
            return false;
        }

        return hourOfDay < 8 || hourOfDay > 22;
    }
}

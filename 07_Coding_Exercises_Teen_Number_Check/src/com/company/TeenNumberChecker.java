package com.company;

public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(1, 6, 7)); // return false
        System.out.println(hasTeen(9, 99, 19)); // return true
        System.out.println(hasTeen(23, 15, 52)); // return true
        System.out.println(hasTeen(22, 23, 24)); // return false
        System.out.println(isTeen(12)); // return false
        System.out.println(isTeen(13)); // return true
        System.out.println(isTeen(17)); // return true
        System.out.println(isTeen(19)); // return true
        System.out.println(isTeen(20)); // return false
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        int[] ages = {age1, age2, age3};

        for (int age : ages) {
            if (isTeen(age)) {
                return true;
            }
        }

        return false;
    }

    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }
}

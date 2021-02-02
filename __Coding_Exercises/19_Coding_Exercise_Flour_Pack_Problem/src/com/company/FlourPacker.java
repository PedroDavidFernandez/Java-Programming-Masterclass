package com.company;

public class FlourPacker {
    //public static final int BIG_TOTAL_VALUE = 5;

    public static void main(String[] args) {
        System.out.println("test 1, 0, 4: " + canPack(1, 0, 4)); // false
        System.out.println("test 1, 0, 5 " + canPack(1, 0, 5)); // true
        System.out.println("test 1, 0, 6 " + canPack(1, 0, 6)); // false
        System.out.println("test 0, 5, 4 " + canPack(0, 5, 4)); // true
        System.out.println("test 2, 2, 12 " + canPack(2, 2, 12)); // true
        System.out.println("test 4, 8, 19 " + canPack(4, 18, 19)); // true
        System.out.println("test 3, -2, 12 " + canPack(3, -2, 12)); // false
        System.out.println("test 6, 2, 17 " + canPack(6, 2, 17)); // true
        System.out.println("test 2, 10, 18 " + canPack(2, 10, 18)); // true
        System.out.println("test 5, 3, 24 " + canPack(5, 3, 24)); // false
        System.out.println("test 2, 1, 5 " + canPack(2, 1, 5)); // true
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bigCountTotal = bigCount * 5;
        int total = bigCountTotal + smallCount;

        if (total == goal) {
            return true;
        } else {
            System.out.println(goal % 5);
            System.out.println(smallCount >= goal % 5);
            if (total > goal && smallCount >= goal % 5) {
                System.out.println("chivato");
                return true;
            } else if (bigCount == 0 && smallCount >= goal) {
                return true;
            } else {
                return false;
            }
        }
    }
}

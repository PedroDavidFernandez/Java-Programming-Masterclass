package com.company;

public class ReverseArray {

    public static void main(String[] args) {
	    reverese(new int[]{1,2,3,4,5});
    }

    private static void reverese(int[] array) {
        System.out.println("Array");
        for (int i=0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Reversed Array");
        for (int i=array.length - 1; i < array.length; i--) {
            System.out.println(array[i]);
        }
    }
}

package example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // Value Types
        int myIntValue = 10;
	    int anotherIntValue = myIntValue;

        System.out.println("myIntValue " + myIntValue);
        System.out.println("anotherIntValue " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue " + myIntValue);
        System.out.println("after increment anotherIntValue " + anotherIntValue);

        // Reference Types
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));

        anotherArray[0] = 12;

        System.out.println("myIntArray after change: " + Arrays.toString(myIntArray));
        System.out.println("anotherArray after change: " + Arrays.toString(anotherArray));

        anotherArray = new int[]{4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("myIntArray after modify: " + Arrays.toString(myIntArray));
        System.out.println("anotherArray after modify: " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 6;
        array = new int[] {1, 2, 3, 4, 5};
        System.out.println("array: " + Arrays.toString(array));
    }
}

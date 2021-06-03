package com.company;

public class TestClass {

    public static void main(String[] args) {
	// write your code here
        System.out.println("*** TEST CODE BEGINS ***");
        float value1 = 102;
        float value2 = (int)102.0;
        // float value3 = 1f * 0.0; -> impossible conversion from double to float
        float value4 = 1f * (short)0.0;
        // float value5 = 1f * (boolean)0; -> incompatible types

        System.out.println("*** COMPILED WITH NO ERRORS! ***");
    }
}

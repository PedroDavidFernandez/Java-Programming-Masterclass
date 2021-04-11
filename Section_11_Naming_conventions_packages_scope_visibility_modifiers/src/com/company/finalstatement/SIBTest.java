package com.company.finalstatement;

public class SIBTest {
    public static final String owner;

    static {
        owner = "Pedro";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIB Constructor called.");
    }

    static {
        System.out.println("2nd initialization blocked called.");
    }

    public void someMethod() {
        System.out.println("some method called");
    }
}

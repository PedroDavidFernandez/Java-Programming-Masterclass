package com.company.finalstatement;

public class SomeClass {
//    private final int instanceNumber = 1;
    private static int classCounter = 0;
    private int instanceNumber;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instace is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}

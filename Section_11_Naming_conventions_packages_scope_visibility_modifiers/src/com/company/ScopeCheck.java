package com.company;

public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, public var = " + publicVar + ": private var = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo() {
        int privateVar = 2;
        for (int i=0; i<10; i++) {
            System.out.println(i + " times two is " + i * privateVar);
            //System.out.println(i + " times one is " + i * this.privateVar); -- Multiply by 2
        }
    }

    public class InnerClass {
        public int privateVar = 3;

        public InnerClass() {
            System.out.println("Inner class created, privateVar is " +  privateVar);
        }

        public void timesTwo() {
            int privateVar = 2;
            for (int i=0; i<10; i++) {
                System.out.println(i + " times two is " + i * privateVar);
            //    System.out.println(i + " times two is " + i * this.privateVar); -- multiply by 3
            }
        }
    }
}

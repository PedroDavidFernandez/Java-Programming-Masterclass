package com.company;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, public var = " + publicVar + ": private var = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        int varTwo = 2;
        for (int i=0; i<10; i++) {
            System.out.println(i + " times two is " + i * varTwo);
            //System.out.println(i + " times one is " + i * this.privateVar); -- Multiply by 2
        }
    }

    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("var 3 from inner class " + innerClass.varThree);
    }

    public class InnerClass {
        private int varThree = 3;

        public InnerClass() {
            System.out.println("Inner class created, varOne is " + varOne);
            System.out.println("Inner class created, privateVar is " + varThree);
        }

        public void timesTwo() {
            System.out.println("var one is still here " + varOne);
            for (int i=0; i<10; i++) {
                System.out.println(i + " times two is " + i * varThree);
            //    System.out.println(i + " times two is " + i * this.privateVar); -- multiply by 3
            }
        }
    }
}

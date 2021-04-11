package com.company.finalstatement;

public class Main {
    public static void main(String[] args) {
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

//        one.instanceNumber = 4;

        System.out.println(Math.PI);
        /* Math math = new Math(); --> Class has been declared with a private constructor and cannot be
        extended either, since it has been defined as final */

        System.out.println("*** **** ***");

        int validPassword = 1111111111;
//        Password password = new Password(validPassword);
        Password password = new ExtendedPassword(validPassword);
        password.storePassword();

        password.letMeIn(12);
        password.letMeIn(987852);
        password.letMeIn(-555);
        password.letMeIn(0);
        password.letMeIn(1123277);
        password.letMeIn(888666999);

//        SIBTest test = new SIBTest();
//        test.someMethod();
//        System.out.println("Owner is " + SIBTest.owner);
    }
}

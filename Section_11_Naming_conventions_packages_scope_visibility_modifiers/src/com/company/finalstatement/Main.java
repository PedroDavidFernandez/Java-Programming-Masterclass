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

        int pw = 674312;
//        Password password = new Password(pw);
        Password password = new ExtendedPassword(pw);
        password.storePassword();

        password.letMeIn(12);
        password.letMeIn(987852);
        password.letMeIn(-555);
        password.letMeIn(0);
        password.letMeIn(1123277);
        password.letMeIn(674312);
    }
}

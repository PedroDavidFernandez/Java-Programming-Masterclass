package com.company.coding_exercise_encapsulation;

import com.company.coding_exercise_encapsulation.Printer;

public class Driver {
    public static void main(String[] args) {
//        Printer printer = new Printer(
//            50,
//                false
//        );
//        System.out.println(printer.printPages(10));
//        System.out.println(printer.printPages(57));


        Printer printer2 = new Printer(
                50,
                true
        );
        System.out.println(printer2.printPages(10));
        System.out.println(printer2.printPages(10));

//        System.out.println(printer2.addToner(30));
//        System.out.println(printer2.addToner(30));
    }
}

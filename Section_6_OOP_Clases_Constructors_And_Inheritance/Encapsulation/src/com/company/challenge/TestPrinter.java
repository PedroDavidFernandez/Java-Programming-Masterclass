package com.company.challenge;

public class TestPrinter {
    public static void main(String[] args) {
        System.out.println("*** PRINTER 1 ***");

        Printer printer = new Printer(
                50,
                true
        );

        System.out.println("Current number of printed pages is " + printer.getPrintedPages());
        printer.printPage(-5);
        System.out.println("Current number of printed pages is " + printer.getPrintedPages());
        printer.printPage(13);
        System.out.println("Current number of printed pages is " + printer.getPrintedPages());
        printer.printPage(250);
        System.out.println("Current number of printed pages is " + printer.getPrintedPages());
        printer.fillToner(-10.0);
        System.out.println("Current Toner Level is " + printer.getTonerLevel());
        printer.fillToner(30.0);
        System.out.println("Current Toner Level is " + printer.getTonerLevel());
        printer.fillToner(10.0);
        System.out.println("Current Toner Level is " + printer.getTonerLevel());
        printer.fillToner(10.0);
        System.out.println("Current Toner Level is " + printer.getTonerLevel());
        printer.fillToner(10.0);
        System.out.println("Current Toner Level is " + printer.getTonerLevel());
        System.out.println("Can print on double page? " + printer.isDuplex());

        System.out.println("*** PRINTER 2 ***");

        Printer printer2 = new Printer(
                50,
                false
        );
        System.out.println("Current number of printed pages for printer 2 is: "
                + printer2.getPrintedPages());
        printer2.printPage(25);
        System.out.println("Current number of printed pages for printer 2 is: "
                + printer2.getPrintedPages());
    };
}

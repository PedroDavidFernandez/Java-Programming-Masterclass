package com.company.challenge;

public class Printer {
    private double tonerLevel;
    private int printedPages;
    private boolean isDuplex;

    public Printer(double tonerLevel, boolean isDuplex) {
        if (tonerLevel < 0 || tonerLevel > 100) {
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.printedPages = 0;
        this.isDuplex = isDuplex;
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getPrintedPages() {
        return printedPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public int printPage(int numberOfPages) {
        if (numberOfPages < 0) {
            System.out.println("Please provide a number of pages of pages to print higher than 0!");
            return -1;
        }

        int pagesToPrint = numberOfPages;
        if (this.isDuplex) {
            pagesToPrint = (numberOfPages/2) + (numberOfPages % 2);
            System.out.println("Printing in duplex mode");
        }

        this.printedPages += pagesToPrint;
        return pagesToPrint;
    }

    public double fillToner(double tonerAmount) {
        if (tonerAmount < 0 || (tonerAmount  + this.tonerLevel) > 100) {
            System.out.println("Toner level can not be filled higher to 100% or a negative amount");
            System.out.println("Current level is of " + this.tonerLevel);
            return -1;
        };

        return this.tonerLevel += tonerAmount;
    }
}

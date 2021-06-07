package com.company;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("Bread", 0.99, 250);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.25, 100);
        stockList.addStock(temp);

        temp = new StockItem("Car", 22, 1);
        stockList.addStock(temp);

        temp = new StockItem("Champaigne", 42.76, 5);
        stockList.addStock(temp);

        temp = new StockItem("Sport Jacket", 70, 10);
        stockList.addStock(temp);

        temp = new StockItem("Wine", 4.99, 15);
        stockList.addStock(temp);

        System.out.println(stockList);
    }
}

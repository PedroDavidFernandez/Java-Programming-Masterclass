package com.company;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("Bread", 0.99, 250);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.25, 100);
        stockList.addStock(temp);

        temp = new StockItem("car", 22, 1);
        stockList.addStock(temp);

        temp = new StockItem("Champaigne", 42.76, 5);
        stockList.addStock(temp);

        temp = new StockItem("Sport Jacket", 70, 10);
        stockList.addStock(temp);

        temp = new StockItem("Wine", 4.99, 15);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s: stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket pedrosBasket = new Basket("Pedro");
        sellItem(pedrosBasket, "car", 1);
        System.out.println(pedrosBasket);

        sellItem(pedrosBasket, "car", 1);
        System.out.println(pedrosBasket);

        sellItem(pedrosBasket, "bike", 1);
        System.out.println(pedrosBasket);

        sellItem(pedrosBasket, "Wine", 3);
        sellItem(pedrosBasket, "Sport Jacket", 9);
        sellItem(pedrosBasket, "Champaigne", 1);
        System.out.println(pedrosBasket);

        System.out.println(stockList);

        temp = new StockItem("pencil", 2);
        // stockList.Items().put(temp.getName(), temp);
        stockList.Items().get("car").adjustStock(333333);
        //stockList.get("car").adjustStock(-111111);
        System.out.println(stockList);

        for (Map.Entry<String, Double> price : stockList.PriceList().entrySet()) {
            System.out.println(price.getKey() + " costs " + price.getValue());
        }
    }

    private static int sellItem(Basket basket, String item, int quantity) {
        // retrieve Item from stock list
        StockItem stockItem = stockList.get(item);

        System.out.println(stockItem);

        if ((stockItem == null) || (stockItem.availableQuantity() <= 0)) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.reserveStock(item, quantity) != 0) {
             // basket.addToBasket(stockItem, quantity);
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    private static int removeItem(Basket basket, String item, int quantity) {
        // retrieve Item from stock list
        StockItem stockItem = stockList.get(item);

        System.out.println(stockItem);

        if ((stockItem == null) || (stockItem.availableQuantity() <= 0)) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(basket.removeFromBasket(stockItem, quantity) == quantity) {
            // basket.addToBasket(stockItem, quantity);
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkout(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
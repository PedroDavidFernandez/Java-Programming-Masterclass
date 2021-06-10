package com.company;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("Bread", 0.99, 250, 0);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.25, 100, 0);
        stockList.addStock(temp);

        temp = new StockItem("car", 22, 1, 0);
        stockList.addStock(temp);

        temp = new StockItem("Champaigne", 42.76, 5, 0);
        stockList.addStock(temp);

        temp = new StockItem("Sport Jacket", 70, 10, 0);
        stockList.addStock(temp);

        temp = new StockItem("Wine", 4.99, 15, 0);
        stockList.addStock(temp);

        Basket pedrosBasket = new Basket("Pedro");
        reserveItem(pedrosBasket, "car", 1);
        System.out.println(pedrosBasket);

        reserveItem(pedrosBasket, "Bread", 125);
        System.out.println(pedrosBasket);
        System.out.println(stockList);

        sellItem(pedrosBasket, "Bread");
        System.out.println(pedrosBasket);
        System.out.println(stockList);

        for (Map.Entry<String, Double> price : stockList.PriceList().entrySet()) {
            System.out.println(price.getKey() + " costs " + price.getValue());
        }
    }

    public static int reserveItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);

        System.out.println("QUANTITY TO RESERVE:" + quantity);
        System.out.println("QUANTITY IN STOCK: " + stockItem.quantityInStock());
        System.out.println("RESERVED ITEMS:" + stockItem.reservedItems());
        System.out.println("QUANTITY IN STOCK - RESERVED:" + (stockItem.quantityInStock() - stockItem.reservedItems()));

        if ((stockItem == null) || (quantity > (stockItem.quantityInStock() - stockItem.reservedItems()))) {
            System.out.println("There is not enough stock of " + item);
            return 0;
        }

        if(stockList.reserveStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }

    public static int unreserveItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);

        System.out.println("QUANTITY TO RESERVE:" + quantity);
        System.out.println("QUANTITY IN STOCK: " + stockItem.quantityInStock());
        System.out.println("RESERVED ITEMS:" + stockItem.reservedItems());
        System.out.println("QUANTITY IN STOCK - UNRESERVED:" + (stockItem.quantityInStock() + stockItem.reservedItems()));

        if ((stockItem == null) || (quantity > stockItem.reservedItems())) {
            System.out.println("Number of items to unreserve is higher than current reserved items");
            return 0;
        }

        if(stockList.unreserveStock(item, quantity) != 0) {
            basket.removeFromBasket(stockItem, quantity);
            return quantity;
        }

        return 0;
    }

    private static int sellItem(Basket basket, String item) {
        // retrieve Item from stock list
        StockItem stockItem = stockList.get(item);

        System.out.println(stockItem);

        if ((stockItem == null) || (stockItem.quantityInStock() <= 0)) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        stockList.sellStock(item);
        return 0;
    }
}

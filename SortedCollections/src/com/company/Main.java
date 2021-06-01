package com.company;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
	    StockItem temp = new StockItem("bread", 0.86, 100);
	    stockList.addStock(temp);

	    temp = new StockItem("cake", 1.10,7);
	    stockList.addStock(temp);

        temp = new StockItem("car", 12.50,2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 0.55,200);
        stockList.addStock(temp);

        temp = new StockItem("cup", 60,74);
        stockList.addStock(temp);
        temp = new StockItem("cup", 66,90);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95,4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.40,36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 1500.10,1);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40,80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 7.73,40);
        stockList.addStock(temp);

        System.out.println(stockList);
        for (String s : stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket basket = new Basket("Pedro's");
        sellItem(basket, "car", 1);
        System.out.println(basket);

        sellItem(basket, "car", 1);
        System.out.println(basket);

        if (sellItem(basket, "car", 1) != 1) {
            System.out.println("There are no more cars in stock!");
        };

        sellItem(basket, "fan", 12);
        System.out.println(basket);

        sellItem(basket, "juice", 12);
        System.out.println(basket);

        System.out.println(stockList);
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We dont sell " + item);
            return 0;
        }
        if (stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem,  quantity);
            return quantity;
        }
        return 0;
    }
}

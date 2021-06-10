package com.company;

public class StockItem implements Comparable<StockItem>{
    private final String name;
    private double price;
    private int quantityStock = 0; // can be initialized here
    private int reserved;

    public StockItem(String name, double price) {
        this(name, price, 0, 0);
    }

    public StockItem(String name, double price, int quantityStock, int reserved) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
        this.reserved = reserved;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return quantityStock;
    }

    public int reservedItems() {
        return reserved;
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityStock + quantity;

        System.out.println("NEW QUANTITY" + newQuantity);

        if (newQuantity >= 0) {
            this.quantityStock = newQuantity;
        }
    }

    public void reserveStock(int quantity) {
        int newReserved = this.reserved + quantity;
        if (newReserved >= 0) {
            this.reserved = newReserved;
        }
    }

    public void unreserveStock(int quantity) {
        int newUnreserved = this.reserved - quantity;
        if (newUnreserved >= 0) {
            this.reserved = newUnreserved;
        }
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering Stock Item.equals");
        if (obj == this) {
            return true;
        }

        if ((obj == null) || (this.getClass() != obj.getClass())) {
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem item) {
        System.out.println("Entering stockItem.compareTo");

        if (this == item) {
            return 0;
        }

        if (item != null) {
            return this.name.compareTo(item.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price;
    }
}

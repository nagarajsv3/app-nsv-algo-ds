package com.nsv.jsmbaba.rnd;

public class Product {

    // properties
    private String pname;
    private int qty;
    private double price;
    private double totalPrice;

    // constructor
    public Product(String pname, int qty,
            double price, double totalPrice) {
        this.pname = pname;
        this.qty = qty;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    // getter methods
    public String getPname() {
        return pname;
    }
    public int getQty() {
        return qty;
    }
    public double getPrice() {
        return price;
    }
    public double getTotalPrice() {
        return totalPrice;
    }

    // displayFormat
    public static void displayFormat() {
        System.out.print("\nItem      Quantity    Price   Total Price\n");
    }
    // display
    public void display() {
        System.out.format("%-9s %8d %10.2f %10.2f\n", pname, qty, price, totalPrice);
    }

    @Override
    public String toString() {
        return "Item: " + getPname() + " Quantity: " + getQty() + " Unit price: $" + getPrice() + " subTotal: " + getTotalPrice();
    }
}

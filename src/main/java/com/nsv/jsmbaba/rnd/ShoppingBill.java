package com.nsv.jsmbaba.rnd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingBill {

    public static void main(String[] args) {

        // variables
        String productName = null;
        int quantity = 0;
        double price = 0.0;
        double totalPrice = 0.0;
        double overAllPrice = 0.0;

        // create Scanner class object
        Scanner scan = new Scanner(System.in);
        String end = "END";

        List<Product> products = new ArrayList<Product>();


        System.out.print("Please enter shopping item description or type \"END\" to finish shopping: ");
        productName = scan.nextLine();


        while (!productName.equalsIgnoreCase(end)) {
            System.out.print("Please enter the unit price of this item: ");
            price = scan.nextDouble();
            System.out.print(" Please enter the quantity you purchased: ");
            quantity = scan.nextInt();

            // calculate total price for that products
            totalPrice = price * quantity;

            // calculate overall price
            overAllPrice += totalPrice;

            // create Product class object and add it to the list
            products.add(new Product(productName, quantity, price, totalPrice));

            System.out.print("Please enter shopping item description or type \"END\" to finish shopping: ");
            productName = scan.next();
        }


        // display all products with its properties
        //Product.displayFormat();
        for (Product p : products) {
            System.out.println(p.toString());
        }

        // overall price
        System.out.println("\nThe total price for the whole shopping cart is: $" + overAllPrice);

        // close Scanner
        scan.close();
    }

}

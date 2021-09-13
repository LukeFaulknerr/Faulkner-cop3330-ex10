/*
    UCF COP3330 Fall 2021 Assignment 10 Solution
    Copyright 2021 Luke Faulkner
 */

import java.util.Scanner;

public class ex10 {

    static double tax = 0.055;

    public static void main(String[] args) {
        // Variables / Objects
        Scanner selfCheckout = new Scanner(System.in);
        String price1Str, quantity1Str, price2Str, quantity2Str, price3Str, quantity3Str;

        // Prompt
        System.out.print("Enter the price of item 1: " );
        price1Str = selfCheckout.nextLine();
        int price1 = Integer.parseInt(price1Str);

        System.out.print("Enter the quantity of item 1: ");
        quantity1Str = selfCheckout.nextLine();
        int quantity1 = Integer.parseInt(quantity1Str);

        System.out.print("Enter the price of item 2: " );
        price2Str = selfCheckout.nextLine();
        int price2 = Integer.parseInt(price2Str);

        System.out.print("Enter the quantity of item 2: ");
        quantity2Str = selfCheckout.nextLine();
        int quantity2 = Integer.parseInt(quantity2Str);

        System.out.print("Enter the price of item 3: " );
        price3Str = selfCheckout.nextLine();
        int price3 = Integer.parseInt(price3Str);

        System.out.print("Enter the quantity of item 3: ");
        quantity3Str = selfCheckout.nextLine();
        int quantity3 = Integer.parseInt(quantity3Str);

        // Calculations
        double subtotal = (double)(price1 * quantity1 + price2 * quantity2 + price3 * quantity3);
        double taxTotal = subtotal * tax;
        double total = subtotal + taxTotal;

        // Output
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + taxTotal);
        System.out.println("Total: $" + total);
    }
}

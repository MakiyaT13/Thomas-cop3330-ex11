/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Makiya Thomas
 */
package com.company;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        int euros = input.nextInt();

        System.out.print("What is the exchange rate? ");
        double rate = input.nextInt();

        double c_to = rate * euros;

        System.out.printf("%d euros at an exchange rate of %.4f is\n %.2f U.S. dollars.\n", euros, rate, c_to );
    }
}

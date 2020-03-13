package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
evenOrOdd();
keepContained();
lastDigit();
    }

    public static void evenOrOdd() {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int positiveNumber;

        System.out.println("Give me a positive number.");
        positiveNumber = keyboard.nextInt();
        System.out.println("Number is odd: "+ (positiveNumber % 2 != 0));
    }

    public static void keepContained() {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int posNumber;

        System.out.println("Give me a positive number.");
        posNumber = keyboard.nextInt();
        System.out.println(posNumber +" contained is: " + ((posNumber%8)+5));
    }

    public static void lastDigit() {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int fourDigit;

        System.out.println("Give me a four digit positive number.");
        fourDigit = keyboard.nextInt();
        System.out.println("The last digit is: " + fourDigit%10);
    }
}

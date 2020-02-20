package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
evenOrOdd();
    }

    public static void evenOrOdd() {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int positiveNumber;

        System.out.println("Give me a positive number.");
        positiveNumber = keyboard.nextInt();
        System.out.println("Number is odd: "+ (positiveNumber % 2 != 0));
    }
}

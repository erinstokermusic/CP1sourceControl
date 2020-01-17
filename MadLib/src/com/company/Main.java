package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard;

        keyboard = new Scanner(System.in);

        // phase one

        String usersName;


        String name;


        String nounOne;


        String nounTwo;


        String nounThree;


        String pastTenseVerb;


        String nounFour;


        String pastTenseVerbTwo;


        String placeOne;


        String placeTwo;


        String adjectiveEDOne;


        String adjectiveOne;


        String pastTenseVerbThree;


        String nounFive;


        String pastTenseVerbFour;


        String adverb;


        String adjectiveTwo;


        String numberOne;


        String pastTenseVerbFive;


        String nounSix;


        String nounSeven;

        //phase two

        System.out.println("What's your name?");

        usersName = keyboard.nextLine();

        System.out.println("What's the name of your best friend?");

        name = keyboard.nextLine();

        System.out.println("Give me a noun.");

        nounOne = keyboard.nextLine();

        System.out.println("Give me another noun.");

        nounTwo = keyboard.nextLine();

        System.out.println("Another noun.");

        nounThree = keyboard.nextLine();

        System.out.println("Another noun.");

        nounFour = keyboard.nextLine();

        System.out.println("Another one. We need a lot of nouns.");

        nounFive = keyboard.nextLine();

        System.out.println("Another noun.");

        nounSix = keyboard.nextLine();

        System.out.println("Last one.");

        nounSeven = keyboard.nextLine();

        System.out.println("Give me a verb in the past tense.");

        pastTenseVerb = keyboard.nextLine();

        System.out.println("Another past tense verb.");

        pastTenseVerbTwo = keyboard.nextLine();

        System.out.println("Another one. We need a lot of these too.");

        pastTenseVerbThree = keyboard.nextLine();

        System.out.println("Another one.");

        pastTenseVerbFour = keyboard.nextLine();

        System.out.println("Another one.");

        pastTenseVerbFive = keyboard.nextLine();

        System.out.println("Give me an adjective.");

        adjectiveOne = keyboard.nextLine();

        System.out.println("Give me another adjective.");

        adjectiveTwo = keyboard.nextLine();

        System.out.println("Give me an adjective ending in ed.");

        adjectiveEDOne = keyboard.nextLine();

        System.out.println("Give me an adverb.");

        adverb = keyboard.nextLine();

        System.out.println("Give me the name of a place. It can be as specific or as general as you want.");

        placeOne = keyboard.nextLine();

        System.out.println("Give me a second place.");

        placeTwo = keyboard.nextLine();

        System.out.println("Give me a number, but in the style of first, second, etc.");

        numberOne = keyboard.nextLine();

        //phase three

        System.out.println(usersName + "'s " + nounOne + "\n" +
                "The " + nounTwo + " Eaters\n" +
                "Now " + name + " the lord of " + nounThree +" " + pastTenseVerb + " in the north\n" +
                "a(n) " + nounFour + " against the ships, and driving veils\n" +
                "of squall " + pastTenseVerbTwo + " down like night on " + placeOne + " and " + placeTwo + ".\n" +
                "The bows went plunging at the gust; sails\n" +
                adjectiveEDOne + " and lashed out strips in the " + adjectiveOne + " wind.\n" +
                "We " + pastTenseVerbThree + " death in that " + nounFive + ", " + pastTenseVerbFour + " the yards,\n" +
                "unshipped the oars, and pulled for the nearest lee:\n" +
                "then two long days and nights we lay " + adverb + "\n" +
                "worn out and " + adjectiveTwo + " at heart, tasting our grief,\n" +
                "until a " + numberOne + " dawn came with ringlets shining.\n" +
                "Then we put up our masts, " + pastTenseVerbFive + " sail, and rested,\n" +
                "letting the " + nounSix + " and the " + nounSeven + " take over.\n" +
                "\n");

    }
}

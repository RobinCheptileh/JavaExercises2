package com.cognition.main;

import java.util.Scanner;

/**
 * Created by robin on 6/16/17.
 * <p>
 * Main class
 */
public class Main {

    public static void main(String[] args) {
        choose();
    }

    private static void choose() {
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a question:" +
                "\n\t1. Write a program that translates a text to pig-latin and back. English is translated to pig-latin" +
                " by taking the first letter of every word, moving it to the end of the word and adding 'ay'." +
                "\n\t2. Write a program that checks if a string is a palindrome." +
                "\n\t3. Write a program that checks if a string is a palindrome (Method 2)." +
                "\n\t4. Write a program that determines whether two positive integer numbers are co-prime. Two numbers are" +
                " co-prime if their greatest common divisor (GCD) = 1." +
                "\n\t5. Write a program that finds the Kth element in a list." +
                "\n\t6. Exit");
        int action = input.nextInt();

        switch (action) {
            case 1:
                Ex1.main(null);
                break;

            case 2:
                Ex2.main(null);
                break;

            case 3:
                Ex2M2.main(null);
                break;

            case 4:
                Ex3.main(null);
                break;

            case 5:
                Ex4.main(null);
                break;

            case 6:
                System.out.println("\n\tBye!");
                break;

            default:
                System.out.println("Invalid choice");
                choose();
                break;
        }
    }
}

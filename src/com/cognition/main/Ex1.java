package com.cognition.main;

import java.util.Scanner;

/**
 * Created by robin on 6/16/17.
 * <p>
 * 1. Write a program that translates a text to pig-latin and back. English is translated to pig-latin by taking the
 * first letter of every word, moving it to the end of the word and adding 'ay'.
 */
public class Ex1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter sentence to translate");
        String sentence = input.nextLine();
        choose(sentence.toLowerCase());
    }

    private static void choose(String sentence) {
        String[] words = sentence.split(" ");

        System.out.println("Choose 1 or 2:" +
                "\n\t1. English to pig-latin." +
                "\n\t2. Pig-latin to English.");
        int action = input.nextInt();
        switch (action) {
            case 1:
                //English to pig-latin
                for (String word : words) {
                    String newWord = word.substring(1) + word.substring(0, 1) + "ay";
                    System.out.print(newWord + " ");
                }
                break;

            case 2:
                //Pig-latin to English
                for (String word : words) {
                    String newWord = word.substring((word.length() - 3), (word.length() - 2)) + word.substring(0, word.length() - 3);
                    System.out.print(newWord + " ");
                }
                break;

            default:
                System.out.println("Invalid choice");
                choose(sentence);
                break;
        }
    }
}

package com.cognition.main;

import java.util.Scanner;

/**
 * Created by robin on 6/16/17.
 * <p>
 * 2. Write a program that checks if a string is a palindrome.
 */
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Enter word to check if it's a palindrome");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        char[] letters = word.toCharArray();
        String newWord = "";
        for (int i = letters.length - 1; i >= 0; i--) {
            newWord += letters[i];
        }
        if (word.toLowerCase().equals(newWord.toLowerCase()))
            System.out.println(word + " is a palindrome");
        else
            System.out.println(word + " is not a palindrome");
    }
}

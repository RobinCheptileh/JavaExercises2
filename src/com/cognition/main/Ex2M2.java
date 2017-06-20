package com.cognition.main;

import java.util.Scanner;

/**
 * Created by robin on 6/20/17.
 * <p>
 * 2. Write a program that checks if a string is a palindrome.
 * This is by use of substrings.
 */
public class Ex2M2 {
    public static void main(String[] args) {
        System.out.println("Enter word bruh");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        String newWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            newWord += word.substring(i, i + 1);
        }
        if (word.toLowerCase().equals(newWord.toLowerCase()))
            System.out.println(word + " is a palindrome");
        else
            System.out.println(word + " is not a palindrome");
    }
}
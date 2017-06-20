package com.cognition.main;

import java.util.Scanner;

/**
 * Created by robin on 6/16/17.
 * <p>
 * 3. Write a program that determines whether two positive integer numbers are co-prime. Two numbers are co-prime if
 * their greatest common divisor (GCD) = 1.
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = input.nextInt();
        System.out.println("Enter second number");
        int second = input.nextInt();
        if (first > second) {
            if ((first % second) == 0)
                System.out.println("Numbers are not co-prime");
            else
                System.out.println("Numbers are co-prime");
        } else {
            if ((second % first) == 0)
                System.out.println("Numbers are not co-prime");
            else
                System.out.println("Numbers are co-prime");
        }
    }
}

package com.cognition.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by robin on 6/16/17.
 * <p>
 * 4. Write a program that finds the Kth element in a list.
 */
public class Ex4 {
    public static void main(String[] args) {
        int[] set = new int[20];
        Random rand = new Random();
        for (int i = 0; i < set.length; i++) {
            set[i] = rand.nextInt(100);
        }
        System.out.println("A randomly generated list to be used: " + Arrays.toString(set));

        System.out.println("Enter index of element to check");
        Scanner input = new Scanner(System.in);
        int check = input.nextInt();
        if (check < set.length && check >= 0)
            System.out.println(set[check]);
        else
            System.out.println("Index is out of bounds of list");
    }
}

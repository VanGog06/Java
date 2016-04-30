/*
You are given an array of integers as a single line, separated by a space. Write a program that checks consecutive pairs
and prints if both are odd/even or not. Note that the array length should also be an even number

Input	        Output
1 2 3 4	        1, 2 -> different
                3, 4 -> different

2 8 11 15 3 2	2, 8 -> both are even
                11, 15 -> both are odd
                3, 2 -> different

1 8 11 1 2	    Invalid length
 */

import java.util.Scanner;

public class EightOddAndEvenPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] numbers = input.split(" ");

        if (numbers.length % 2 != 0) {
            System.out.println("Invalid length");
        } else {
            for (int i = 0; i < numbers.length; i += 2) {
                if (Integer.parseInt(numbers[i]) % 2 == 0 && Integer.parseInt(numbers[i + 1]) % 2 == 0) {
                    System.out.println(numbers[i] + ", " + numbers[i + 1] + " -> both are even");
                } else if (Integer.parseInt(numbers[i]) % 2 != 0 && Integer.parseInt(numbers[i + 1]) % 2 != 0) {
                    System.out.println(numbers[i] + ", " + numbers[i + 1] + " -> both are odd");
                } else {
                    System.out.println(numbers[i] + ", " + numbers[i + 1] + " -> different");
                }
            }
        }
    }
}

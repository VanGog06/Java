/*
Create a Java program that reads a number N from the console and calculates the sum of all numbers from 1 to N (inclusive).

Input	Output
12	    78

Input	Output
1	    1

Input	Output
5	    15
 */

import java.util.Scanner;

public class SixSumNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= input; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}

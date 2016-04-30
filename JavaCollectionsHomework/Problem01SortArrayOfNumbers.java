/*
Write a program to enter a number n and n integer numbers and sort and print them. Keep the numbers in array of
integers: int[]. Examples:

Input	                Output
7                       -3 4 4 5 6 10 120
6 5 4 10 -3 120 4

3                       8 9 10
10 9 8

1                       999
999
 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem01SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        Arrays.sort(input);

        for (int i : input) {
            System.out.print(i + " ");
        }
    }
}

/*
Write a program that recursively calculates factorial.

Input	    Output
5	        120
10	        3628800
0	        1
 */

import java.util.Scanner;

public class Problem12CalculateNFactiorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(calculateFactorial(n));
    }

    public static int calculateFactorial(int n) {
        int result;

        if (n == 0 || n == 1) {
            return 1;
        }

        result = n * calculateFactorial(n - 1);
        return result;
    }
}

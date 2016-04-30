/*
Write a program that takes as input an integer – the target – and outputs to the console all pairs of numbers between
1 and 20, which, if added or subtracted, result in the target.

Target	    Output
5	        1 + 4 = 5
            2 + 3 = 5
            3 + 2 = 5
            …
            19 - 14 = 5
            20 - 15 = 5

35	        15 + 20 = 35
            16 + 19 = 35
            17 + 18 = 35
            18 + 17 = 35
            19 + 16 = 35
            20 + 15 = 35

0	        1 - 1 = 0
            2 - 2 = 0
            …
            19 - 19 = 0
            20 - 20 = 0
 */

import java.util.Scanner;

public class NineHitTheTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == target) {
                    System.out.println(i + " + " + j + " = " + target);
                } else if (i - j == target) {
                    System.out.println(i + " - " + j + " = " + target);
                } else {
                    continue;
                }
            }
        }
    }
}

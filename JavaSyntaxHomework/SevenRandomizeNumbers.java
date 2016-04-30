/*
Write a program that takes as input two integers N and M, and randomizes the numbers between them. Note that M may be
smaller than or equal to N.

N	M	Randomized (your output may be different : ))
13	10	10 12 13 11
10	20	12 13 20 10 11 18 15 17 14 19 16
5	5	5
 */

import java.util.*;

public class SevenRandomizeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        List numbersInBetween = new ArrayList();

        int smaller = 0;
        int bigger = 0;

        if (m > n) {
            smaller = n;
            bigger = m;
        } else {
            smaller = m;
            bigger = n;
        }

        for (int i = smaller; i <= bigger; i++) {
            numbersInBetween.add(i);
        }

        Collections.shuffle(numbersInBetween);

        for (Object number : numbersInBetween) {
            System.out.print(number + " ");
        }
    }
}

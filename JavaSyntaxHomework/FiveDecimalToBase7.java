/*
Write a program that takes an integer number and converts it to base-7
Decimal	    Base-7
10	        13
7	        10
123	        234
1000	    2626
1	        1
 */

import java.util.Scanner;

public class FiveDecimalToBase7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(Integer.toString(input, 7));
    }
}

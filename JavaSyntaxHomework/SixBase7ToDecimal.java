/*
Write a program that converts from a base-7 number to its decimal representation
Base-7	    Decimal
13	        10
10	        7
234	        123
2626	    1000
1	        1
 */

import java.util.Scanner;

public class SixBase7ToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(Integer.toString(Integer.parseInt(input, 7), 10));
    }
}

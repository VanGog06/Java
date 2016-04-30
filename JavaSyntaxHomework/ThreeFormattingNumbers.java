/*
Write a program that reads 3 numbers: an integer a (0 ≤ a ≤ 500), a floating-point b and a floating-point c and prints
them in 4 virtual columns on the console. Each column should have a width of 10 characters. The number a should be
printed in hexadecimal, left aligned; then the number a should be printed in binary form, padded with zeroes, then the
number b should be printed with 2 digits after the decimal point, right aligned; the number c should be printed with
3 digits after the decimal point, left aligned. Examples:

a	    b	        c	        result
254	    11.6	    0.5	        |FE        |0011111110|     11.60|0.500     |
499	    -0.5559	    10000	    |1F3       |0111110011|     -0.56|10000.000 |
0	    3	        -0.1234	    |0         |0000000000|      3.00|-0.123    |
444	    -7.5	    7.5	        |1BC       |0110111100|     -7.50|7.500     |
 */

import java.util.Locale;
import java.util.Scanner;

public class ThreeFormattingNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner sc = new Scanner(System.in);

        int firstNumber = sc.nextInt();
        float secondNumber = sc.nextFloat();
        float thirdNumber = sc.nextFloat();

        String binaryString = String.format("%10s", Integer.toBinaryString(firstNumber)).replace(' ', '0');

        System.out.printf("|%-10s|%s|%10.2f|%-10.3f|", Integer.toString(firstNumber, 16).toUpperCase(),
                                          binaryString,
                                          secondNumber,
                                          thirdNumber);
    }
}

/*
Create a method that finds the average of three numbers. Read in internet about java methods. Check the naming conventions.
Invoke your method and test it. Format the output to two digits after the decimal separator. The placeholder is %.2f

a	    b	    c	    Average
1.5	    2.5	    3.8	    2.60
12	    13	    25	    16.67
0.005	0.5	    0.55	0.35
0	    0	    2	    0.67
 */

import java.util.Locale;
import java.util.Scanner;

public class EightGetAverage {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner sc = new Scanner(System.in);

        float firstNumber = sc.nextFloat();
        float secondNumber = sc.nextFloat();
        float thirdNumber = sc.nextFloat();

        printAverage(firstNumber, secondNumber, thirdNumber);
    }

    static void printAverage(float firstNumber, float secondNumber, float thirdNumber) {
        System.out.printf("%.2f", (firstNumber + secondNumber + thirdNumber) / 3);
    }
}

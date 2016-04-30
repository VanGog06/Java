/*
Create a triangle of characters, based on input. Learn about java.util.Scanner and Integer.parseInt (). Test your
program with integers up to 26. Think why.

Input	Ouput

5	    a
        a b
        a b c
        a b c d
        a b c d e
        a b c d
        a b c
        a b
        a

Input	Ouput

3	    a
        a b
        a b c
        a b
        a

 */

import java.util.Scanner;

public class FivePrintCharacterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            for (char c = 'a'; (int)c - 'a'< i; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        for (int i = input - 1; i > 0; i--) {
            for (char c = 'a'; (int)c - 'a'< i; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

/*
Write a program that enters the sides of a rectangle (two integers a and b) and calculates and prints the rectangle's area.
Examples:

Input	Output
7 20	140
5 12	60
 */

import java.util.Scanner;

public class OneRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a * b);
    }
}

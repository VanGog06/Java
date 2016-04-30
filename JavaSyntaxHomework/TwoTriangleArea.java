/*
Write a program that enters 3 points in the plane (as integer x and y coordinates), calculates and prints the area of
the triangle composed by these 3 points. Round the result to a whole number. In case the three points do not form a
triangle, print "0" as result. Examples:

Input	Output
-5 10   575
25 30
60 15

Input   Output
53 18   86
56 23
24 27

Input   Output
1 1     0
2 2
3 3
 */

import java.util.Scanner;

public class TwoTriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        double area = ((x1 * (y2 - y3)) + (x2 * (y3 - y1)) + (x3 * (y1 - y2))) / 2;

        System.out.println(Math.round(Math.abs(area)));
    }
}

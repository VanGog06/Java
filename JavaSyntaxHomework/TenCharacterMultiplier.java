/*
Create a method that takes two strings as arguments and returns the sum of their character codes multiplied
(multiply str1.charAt (0) with str2.charAt (0) and add to the total sum). Then continue with the next two characters.
If one of the strings is longer than the other, add the remaining character codes to the total sum without multiplication.

Input	        Output
Gosho Pesho	    53253
123 522	        7647
a aaaa	        9700
 */

import java.util.Scanner;

public class TenCharacterMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstString = sc.nextLine();
        String secondString = sc.nextLine();

        System.out.println(charMultiplier(firstString, secondString));
    }

    static int charMultiplier(String firstString, String secondString) {
        int sum = 0;
        int lowerLength = 0;
        int biggerLength = 0;
        boolean isFirstBigger = false;

        if (firstString.length() > secondString.length()) {
            biggerLength = firstString.length();
            lowerLength = secondString.length();
            isFirstBigger = true;
        } else {
            biggerLength = secondString.length();
            lowerLength = firstString.length();
        }

        for (int i = 0; i < biggerLength; i++) {
            if (i < lowerLength) {
                sum += firstString.charAt(i) * secondString.charAt(i);
            } else {
                if (isFirstBigger) {
                    sum += firstString.charAt(i);
                } else {
                    sum += secondString.charAt(i);
                }
            }
        }

        return sum;
    }
}

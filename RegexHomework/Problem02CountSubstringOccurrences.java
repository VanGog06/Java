/*
Write a program to find how many times given string appears in given text as substring. The text is given at the first
input line. The search string is given at the second input line. The output is an integer number. Please ignore the
character casing. Examples:

Input	                                                    Output
Welcome to the Software University (SoftUni)!               4
Welcome to programming. Programming is wellness
for developers, said Maxwell.
wel

aaaaaa                                                      5
aa

ababa caba                                                  3
aba

Welcome to SoftUni                                          0
Java
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem02CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();
        String pattern = sc.nextLine();
        int counter = 0;
        int startPosition = 0;

        Pattern pa = Pattern.compile(pattern);
        Matcher ma = pa.matcher(text);

        while(ma.find(startPosition)) {
            counter++;
            startPosition = ma.start() + 1;
        }

        System.out.println(counter);
    }
}

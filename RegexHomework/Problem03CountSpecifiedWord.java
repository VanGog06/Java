/*
Write a program to find how many times a word appears in given text. The text is given at the first input line.
The target word is given at the second input line. The output is an integer number. Please ignore the character casing.
Consider that any non-letter character is a word separator. Examples:

Input	                                                                            Output
Welcome to the Software University (SoftUni)! Welcome to programming.               2
welcome

I am coming...                                                                      0
hello

It's OK, I'm in.                                                                    1
i

Java is a set of several computer software products and specifications from         2
Oracle Corporation that provides a system for developing application software
and deploying it in a cross-platform computing environment. Java is used in a
wide variety of computing platforms from embedded devices and mobile phones on
the low end, to enterprise servers and supercomputers on the high end.
is
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem03CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        String pattern = "\\b" + sc.nextLine() + "\\b";
        int counter = 0;

        Pattern pa = Pattern.compile(pattern);
        Matcher ma = pa.matcher(input);

        while(ma.find()) {
            counter++;
        }

        System.out.println(counter);
    }
}

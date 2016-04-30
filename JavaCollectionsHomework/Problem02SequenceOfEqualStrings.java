/*
Write a program that enters an array of strings and finds in it all sequences of equal elements. The input strings are
given as a single line, separated by a space. Examples:

Input	                    Output
hi yes yes yes bye	        hi
                            yes yes yes
                            bye

SoftUni softUni softuni	    SoftUni
                            softUni
                            softuni

1 1 2 2 3 3 4 4 5 5	        1 1
                            2 2
                            3 3
                            4 4
                            5 5

a b b xxx c c c	            a
                            b b
                            xxx
                            c c c

hi hi hi hi hi	            hi hi hi hi hi

hello	                    hello

Note: the count of the input strings is not explicitly specified, so you might need to read the first input line
as a string and split it by a space.
 */

import java.util.Scanner;

public class Problem02SequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            if (i == input.length - 1) {
                System.out.println(input[i]);
                continue;
            }

            if (input[i].equals(input[i + 1])) {
                System.out.print(input[i] + " ");
            } else {
                System.out.println(input[i]);
            }
        }
    }
}

/*
Write a program that enters an array of strings and finds in it the largest sequence of equal elements.
If several sequences have the same longest length, print the leftmost of them. The input strings are given as a single
line, separated by a space. Examples:

Input	                    Output
hi yes yes yes bye	        yes yes yes
SoftUni softUni softuni	    SoftUni
1 1 2 2 3 3 4 4 5 5	        1 1
a b b xxx c c c	            c c c
hi hi hi hi hi	            hi hi hi hi hi
hello	                    hello
 */

import java.util.Scanner;

public class Problem03LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int currentSequence = 1;
        int longestSeqeuence = 0;
        String longestWord = input[0];

        for (int i = 1; i < input.length; i++) {
            if (input[i - 1].equals(input[i])) {
                currentSequence++;
            } else {
                if (currentSequence > longestSeqeuence) {
                    longestSeqeuence = currentSequence;
                    longestWord = input[i - 1];
                }

                currentSequence = 1;
            }
        }

        //check if bigger after last iteration
        if (currentSequence > longestSeqeuence) {
            longestSeqeuence = currentSequence;
            longestWord = input[input.length - 1];
        }

        for (int i = 0; i < longestSeqeuence; i++) {
            System.out.print(longestWord + " ");
        }
    }
}

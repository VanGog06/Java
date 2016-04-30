/*
Write a program to find all increasing sequences inside an array of integers. The integers are given in a single line,
separated by a space. Print the sequences in the order of their appearance in the input array, each at a single line.
Separate the sequence elements by a space. Find also the longest increasing sequence and print it at the last line.
If several sequences have the same longest length, print the leftmost of them. Examples:

Input	                    Output
2 3 4 1 50 2 3 4 5	        2 3 4
                            1 50
                            2 3 4 5
                            Longest: 2 3 4 5

8 9 9 9 -1 5 2 3	        8 9
                            9
                            9
                            -1 5
                            2 3
                            Longest: 8 9

1 2 3 4 5 6 7 8 9	        1 2 3 4 5 6 7 8 9
                            Longest: 1 2 3 4 5 6 7 8 9

5 -1 10 20 3 4	            5
                            -1 10 20
                            3 4
                            Longest: -1 10 20
10 9 8 7 6 5 4 3 2 1	    10
                            9
                            8
                            7
                            6
                            5
                            4
                            3
                            2
                            1
                            Longest: 10

Note: the count of the input numbers is not explicitly specified, so you might need to read the sequence as string,
then split it by a space and finally parse the obtained tokens to take their integer values.
 */

import java.util.Scanner;

public class Problem04LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int currentSequenceCount = 1;
        int longestSequenceCount = 0;
        int longestSequenceStartIndex = 0;

        System.out.print(input[0] + " ");
        for (int i = 1; i < input.length; i++) {

            if(Integer.parseInt(input[i - 1]) < Integer.parseInt(input[i])) {
                currentSequenceCount++;
                System.out.print(input[i] + " ");
            } else {
                if (currentSequenceCount > longestSequenceCount) {
                    longestSequenceCount = currentSequenceCount;
                    longestSequenceStartIndex = i - currentSequenceCount;
                }

                currentSequenceCount = 1;
                System.out.println();
                System.out.print(input[i] + " ");
            }
        }

        //check if bigger after last iteration
        if (currentSequenceCount > longestSequenceCount) {
            longestSequenceCount = currentSequenceCount;
            longestSequenceStartIndex = input.length - currentSequenceCount;
        }

        System.out.println();
        System.out.print("Longest: ");
        for (int i = longestSequenceStartIndex; i < longestSequenceStartIndex + longestSequenceCount; i++) {
            System.out.print(input[i] + " ");
        }
    }
}

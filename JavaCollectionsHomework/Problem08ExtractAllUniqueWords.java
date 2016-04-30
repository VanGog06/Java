/*
At the first line at the console you are given a piece of text. Extract all words from it and print them in alphabetical
order. Consider each non-letter character as word separator. Take the repeating words only once. Ignore the character
casing. Print the result words in a single line, separated by spaces. Examples:

Input	                                    Output
Welcome to SoftUni. Welcome to Java.	    java to softuni welcome
What is better: Java SE or Java EE?	        better ее is java or se what
hello	                                    hello
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Problem08ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().toLowerCase().split(" ");
        for (int i = 0; i < input.length; i++) {
            input[i] = input[i].replaceAll("[?.,:]", "");
        }

        Set<String> inputSet = new TreeSet<>(Arrays.asList(input));

        for (String s : inputSet) {
            System.out.print(s + " ");
        }
    }
}

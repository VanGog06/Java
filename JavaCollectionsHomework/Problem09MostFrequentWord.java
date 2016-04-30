/*
Write a program to find the most frequent word in a text and print it, as well as how many times it appears in format
"word -> count". Consider any non-letter character as a word separator. Ignore the character casing. If several words
have the same maximal frequency, print all of them in alphabetical order. Examples:

Input	                                                                                Output
in the middle of the night	                                                            the -> 2 times
Welcome to SoftUni. Welcome to Java. Welcome everyone.	                                welcome -> 3 times
Hello my friend, hello my darling. Come on, come here. Welcome, welcome darling.	    come -> 2 times
                                                                                        darling -> 2 times
                                                                                        hello -> 2 times
                                                                                        my -> 2 times
                                                                                        welcome -> 2 times
 */

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem09MostFrequentWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> wordCounter = new TreeMap<>();
        int occurance = 0;

        String[] input = sc.nextLine().toLowerCase().split(" ");
        for (int i = 0; i < input.length; i++) {
            input[i] = input[i].replaceAll("[?.,:]", "");
        }

        for (String word : input) {
            Integer count = wordCounter.get(word);
            if (count == null) {
                count = 0;
            }
            wordCounter.put(word, count+1);
        }

        for (Map.Entry<String, Integer> pair: wordCounter.entrySet()) {
            if (pair.getValue() > occurance) {
                occurance = pair.getValue();
            }
        }

        for (Map.Entry<String, Integer> pair : wordCounter.entrySet()) {
            if (pair.getValue() == occurance) {
                System.out.printf("%s -> %d times\n", pair.getKey(), pair.getValue());
            }
        }
    }
}

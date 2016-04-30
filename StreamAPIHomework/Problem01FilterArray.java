/*
Write a program that filters an array of strings, leaving only the strings with length greater than 3 characters.
Use .filter()

Input	                            Output
Gosho gos pesho pes blabla bla	    Gosho pesho blabla
Kogato cyfnat nalymite.	            Kogato cyfnat nalymite.
To be, or not to be.	            (empty)
 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem01FilterArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        Arrays.stream(input)
                .filter(element -> element.length() > 3)
                .forEach(element -> System.out.print(element + " "));
    }
}

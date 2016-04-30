/*
Write a program that takes as input an array of strings are prints only the words that start and end with capital letter.
Words are only strings that consist of English alphabet letters. Use regex.

Words	                        Output
GoshO blabla NqmaSm1saL         KvoStaA	GoshO KvoStaA
AZ AK 47 RoBoT noWayouT	        AZ AK RoBoT
DrakonI Navsekyde	            DrakonI
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem06StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String pattern = "\\b[A-Z]([a-zA-Z]+)?[A-Z]\\b";

        Pattern pa = Pattern.compile(pattern);
        Matcher ma = pa.matcher(input);

        while(ma.find()) {
            System.out.print(ma.group() + " ");
        }
    }
}

/*
Write a program that extracts words from a string. Words are sequences of characters that are at least two symbols
long and consist only of English alphabet letters. Use regex.

Words	                            Output
Az&76sym&&samo&cvqt&lilav	        Az sym samo cvqt lilav
Shoot18297the1231023dwarves!	    Shoot the dwarves
1798No(*&Girls)*(09Allowed	        No Girls Allowed
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem05ExtractWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String pattern = "[a-zA-Z]+";

        Pattern pa = Pattern.compile(pattern);
        Matcher ma = pa.matcher(input);

        while(ma.find()) {
            System.out.print(ma.group() + " ");
        }
    }
}

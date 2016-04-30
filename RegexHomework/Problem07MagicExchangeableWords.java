/*
Write a method that takes as input two strings of equal length, and returns Boolean if they are exchangeable or not.
Exchangeable are words where the characters in the first string can be replaced to get the second string.
Example: egg and add are exchangeable, but aabbccbb and nnooppzz are not. (First bb corresponds to oo, but second bb
corresponds to zz)

Input	            Output
gosho hapka	        true
aabbaa ddeedd	    true
foo bar	            false
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem07MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        StringBuilder sb1 = new StringBuilder(input[0]);
        StringBuilder sb2 = new StringBuilder(input[1]);

        System.out.println(checkIfExchangeable(sb1, sb2));
    }

    public static boolean checkIfExchangeable(StringBuilder sb1, StringBuilder sb2) {
        Map<Character, Character> corresponds = new LinkedHashMap<>();
        for (int i = 0; i < sb2.length(); i++) {
            if(!corresponds.containsKey(sb1.charAt(i))) {
                corresponds.put(sb1.charAt(i), sb2.charAt(i));
            } else {
                if(corresponds.get(sb1.charAt(i)) == sb2.charAt(i)) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}

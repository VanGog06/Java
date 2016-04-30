/*
Write a program that reads a list of words from the file words.txt and finds the count of vowels (гласни букви),
consonants (съгласни) and other punctuation marks. Since English is a bit tricky, assume that a, e, i, o, u are vowels
and all others are consonants. Punctuation marks are (!,.?). Do not count whitespace.
Write the results in file count-chars.txt.

words.txt	                                    count-chars.txt
Thanks to us, you owe it to the Chinese.	    Vowels: 13
                                                Consonants: 17
                                                Punctuation: 2
 */

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThreeCountCharacterTypes {
    private static final String INPUT_FILE = "resources/CountCharacterTypes.txt";
    private static final String OUTPUT_FILE = "resources/CountCharacterTypesOutput.txt";
    private static final String VOWELS_PATTERN = "[aeiou]";
    private static final String CONSONANTS_PATTERN = "[a-zA-Z&&[^aeiou]&&[^AEIOU]]";
    private static final String PUNCTUATION_PATTERN = "\\p{Punct}";

    public static void main(String[] args) {
        try(
                BufferedReader reader = new BufferedReader(
                                        new FileReader(INPUT_FILE));
                BufferedWriter writer = new BufferedWriter(
                                        new FileWriter(OUTPUT_FILE))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write("Vowels: " + counter(VOWELS_PATTERN, line));
                writer.newLine();
                writer.write("Consonants: " + counter(CONSONANTS_PATTERN, line));
                writer.newLine();
                writer.write("Punctuation: " + counter(PUNCTUATION_PATTERN, line));
            }

        } catch (FileNotFoundException fnfex) {
            System.out.println("File not found!");
        } catch (IOException ioex) {
            System.out.println("I/O Exception!");
        } catch (Exception ex) {
            System.out.println("Exception!");
        }
    }

    public static int counter(String pattern, String input) {
        int count = 0;
        Pattern pa = Pattern.compile(pattern);
        Matcher ma = pa.matcher(input);

        while (ma.find()) {
            count++;
        }

        return count;
    }
}

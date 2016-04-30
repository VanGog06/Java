/*
Write a program that reads a text file and changes the casing of all letters to upper. The file should be overwritten.
Use BufferedReader, FileReader, FileWriter, and PrintWriter.

lines.txt	    lines.txt
Kvo staa?       KVO STAA?
Nishto, ti?     NISHTO, TI?
Chuk, maina.	CHUK, MAINA.
 */

import java.io.*;

public class TwoAllCapitals {
    private static final String INPUT_OUTPUT_FILE = "resources/AllCapitals.txt";

    public static void main(String[] args) {
        String allCapitals = "";

        try(
                BufferedReader reader = new BufferedReader(
                        new FileReader(INPUT_OUTPUT_FILE))) {

            String line;
            while ((line = reader.readLine()) != null) {
                allCapitals += line.toUpperCase() + "\n";
            }

        } catch (FileNotFoundException fnfex) {
            System.out.println("File not found!");
        } catch (IOException ioex) {
            System.out.println("I/O Exception!");
        } catch (Exception ex) {
            System.out.println("Exception!");
        }

        try(
                PrintWriter writer = new PrintWriter(
                        new FileWriter(INPUT_OUTPUT_FILE))) {

            writer.print(allCapitals);

        } catch (FileNotFoundException fnfex) {
            System.out.println("File not found!");
        } catch (IOException ioex) {
            System.out.println("I/O Exception!");
        } catch (Exception ex) {
            System.out.println("Exception!");
        }
    }
}

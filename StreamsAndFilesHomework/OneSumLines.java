/*
Write a program that reads a text file and prints on the console the sum of the ASCII symbols of each of its lines.
Use BufferedReader in combination with FileReader.

lines.txt	    Output
Kvo staa?       824
Nishto, ti?     989
Chuk, maina.	1035
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OneSumLines {
    private static final String INPUT_FILE = "resources/SumLines.txt";

    public static void main(String[] args) {
        try(
                BufferedReader reader = new BufferedReader(
                                        new FileReader(INPUT_FILE))) {

            String line;
            while((line = reader.readLine()) != null) {
                int sum = 0;
                for (int i = 0; i < line.length(); i++) {
                    sum += (int)line.charAt(i);
                }

                System.out.println(sum);
            }

        } catch(FileNotFoundException fnfex) {
            System.out.println("Filne not found!");
        } catch (IOException ioex) {
            System.out.println("IO Exception!");
        } catch (Exception ex) {
            System.out.println("Exception!");
        }
    }
}

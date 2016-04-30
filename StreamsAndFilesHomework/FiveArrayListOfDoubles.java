/*
Write a program that saves and loads the information from an ArrayList to a file using ObjectInputStream, '
ObjectOutputStream. Set the name of the new file as doubles.list
 */

import java.io.*;
import java.util.ArrayList;

public class FiveArrayListOfDoubles {
    private static final String OUTPUT_FILE = "resources/doubles.list";
    private static final String INPUT_FILE = "resources/doubles.list";

    public static void main(String[] args) {
        ArrayList<Double> myDoubles = new ArrayList<>();
        myDoubles.add(1.1);
        myDoubles.add(2.1);
        myDoubles.add(3.1);
        myDoubles.add(4.1);
        myDoubles.add(5.1);

        //write object to file
        try(
                ObjectOutputStream writer = new ObjectOutputStream(
                                            new BufferedOutputStream(
                                                    new FileOutputStream(OUTPUT_FILE)))
        ) {

            writer.writeObject(myDoubles);

        } catch (FileNotFoundException fnfex) {
            System.out.println("File not found!");
        } catch (IOException ioex) {
            System.out.println("I/O Exception!");
        } catch (Exception ex) {
            System.out.println("Exception!");
        }

        //read object to file
        try(
                ObjectInputStream reader = new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream(INPUT_FILE)))
        ) {

            System.out.println(reader.readObject());

        } catch (FileNotFoundException fnfex) {
            System.out.println("File not found!");
        } catch (IOException ioex) {
            System.out.println("I/O Exception!");
        } catch (Exception ex) {
            System.out.println("Exception!");
        }
    }
}

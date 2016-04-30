/*
Write a program that saves and loads the information from a custom Object that you have created to a file using
ObjectInputStream, ObjectOutputStream. Create a class Course that has a String field containing the name and an
integer field containing the number of students attending the course. Set the name of the new file as course.save.
 */

import java.io.*;

public class SixSaveCustomObjectInFile {
    private static final String OUTPUT_FILE = "resources/course.save";
    private static final String INPUT_FILE = "resources/course.save";

    public static void main(String[] args) {
        //write object to file
        try(ObjectOutputStream writer = new ObjectOutputStream(
                                        new BufferedOutputStream(
                                                new FileOutputStream(OUTPUT_FILE)))
        ) {

            Course java = new Course("Java", 200);
            writer.writeObject(java);

        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found!");
        } catch (IOException ioex) {
            System.out.println("I/O Exception!");
        } catch (Exception ex) {
            System.out.println("Exception!");
        }

        //read object to file
        try(ObjectInputStream reader = new ObjectInputStream(
                                       new BufferedInputStream(
                                               new FileInputStream(INPUT_FILE)))
        ) {

            Course java = (Course)reader.readObject();
            System.out.println(java.name);
            System.out.println(java.studentNumber);

        } catch (FileNotFoundException fnfex) {
            System.out.println("File not found!");
        } catch (IOException ioex) {
            System.out.println("I/O Exception!");
        } catch (Exception ex) {
            System.out.println("Exception!");
        }
    }
}

/*
Write a program that copies the contents of a .jpg file to another using FileInputStream, FileOutputStream, and
byte[] buffer. Set the name of the new file as my-copied-picture.jpg.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FourCopyJPGFile {
    private static final String INPUT_PICTURE = "resources/picture.jpg";
    private static final String OUTPUT_PICTURE = "resources/my-copied-picture.jpg";

    public static void main(String[] args) {
        try(
                FileInputStream reader = new FileInputStream(INPUT_PICTURE);
                FileOutputStream writer = new FileOutputStream(OUTPUT_PICTURE)) {

            byte[] buffer = new byte[4096];
            int i;
            while ((i = reader.read(buffer)) != -1) {
                writer.write(buffer);
            }

        } catch (FileNotFoundException fnfex) {
            System.out.println("File not found!");
        } catch (IOException ioex) {
            System.out.println("I/O Exception!");
        } catch (Exception ex) {
            System.out.println("Exception!");
        }
    }
}

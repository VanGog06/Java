/*
Write a program that reads three txt files words.txt, count-chars.txt and lines.txt and create a zip archive named
text-files.zip. Use FileOutputStream, ZipOutputStream, and FileInputStream.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class SevenCreateZipArchive {
    private static final String INPUT_FILE_ONE = "resources/zipFile1.txt";
    private static final String INPUT_FILE_TWO = "resources/zipFile2.txt";
    private static final String INPUT_FILE_THREE = "resources/zipFile3.txt";
    private static final String OUTPUT_FILE = "resources/text-filez.zip";

    public static void main(String[] args) {
        ArrayList<String> files = new ArrayList<>();
        files.add(INPUT_FILE_ONE);
        files.add(INPUT_FILE_TWO);
        files.add(INPUT_FILE_THREE);

        createZipArchive(files, OUTPUT_FILE);
    }

    public static void createZipArchive(ArrayList<String> files, String outputFile) {
        int level = 9;
        
        try(
                ZipOutputStream writer = new ZipOutputStream(
                                         new BufferedOutputStream(
                                                 new FileOutputStream(outputFile)))
        ) {
            writer.setLevel(level);
            for (String file : files) {
                try(
                        FileInputStream reader = new FileInputStream(file)
                ) {
                    byte[] buffer = new byte[1024];
                    writer.putNextEntry(new ZipEntry(file));
                    int length;

                    while ((length = reader.read(buffer)) > 0) {
                        writer.write(buffer, 0, length);
                    }

                } catch (FileNotFoundException fnfe) {
                    System.out.println("File not found!");
                } catch (IOException ioex) {
                    System.out.println("I/O Exception!");
                } catch (Exception ex) {
                    System.out.println("Exception!");
                }
            }
            
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found!");
        } catch (IOException ioex) {
            System.out.println("I/O Exception!");
        } catch (Exception ex) {
            System.out.println("Exception!");
        }
    }
}

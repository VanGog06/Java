/*
Write a method that returns the first N odd/even elements from a collection. Return as many as you can.
Format: [Get <number of elements> <odd/even>]

Input	        Output
1 2 3 4 5       1 3 5
Get 3 odd

11 6 2 8 1 0    6 2 8 0
Get 8 even
 */

import java.util.Scanner;

public class ElevenGetFirstOddAndEvenElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbersInput = sc.nextLine().split(" ");
        String[] lineInput = sc.nextLine().split(" ");
        boolean isOdd = false;

        if (lineInput[2].equals("odd")) {
            isOdd = true;
        }

        returnElements(numbersInput, lineInput[1], isOdd);
    }

    static void returnElements(String[] numbersInput, String size, boolean isOdd) {
        int counter = 0;

        for (int i = 0; i < numbersInput.length; i++) {
            if (counter == Integer.parseInt(size)) {
                break;
            }

            if (isOdd && Integer.parseInt(numbersInput[i]) % 2 != 0) {
                System.out.print(numbersInput[i] + " ");
                counter++;
            } else if (!isOdd && Integer.parseInt(numbersInput[i]) % 2 == 0) {
                System.out.print(numbersInput[i] + " ");
                counter++;
            }
        }
    }
}

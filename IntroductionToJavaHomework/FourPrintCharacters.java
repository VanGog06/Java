/*
Print the characters from ‘a’ to ‘z’ on the console on a single line, separated by a space. Use a for-loop. Note: you can
directly declare and increment char in the for-loop. for (char c = ‘a’; …)

Output
a b c d e f g h i j k l m n o p q r s t u v w x y z
 */

public class FourPrintCharacters {
    public static void main(String[] args) {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
    }
}

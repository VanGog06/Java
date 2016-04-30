/*
Use the .sorted() method to sort an array of integers. The first line of input is the array.
The second is the sorting order.

Input	                    Output
6 8 3 1 7 2 2 5             1 2 2 3 5 6 7 8
Ascending

6 8 3 1 7 2 2 5             8 7 6 5 3 2 2 1
Descending
 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem02SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        String sortingWay = sc.nextLine();

        Arrays.stream(input)
                .sorted((element1, element2) -> {
                    if (sortingWay.equals("Ascending")) {
                        return element1.compareTo(element2);
                    } else {
                        return element2.compareTo(element1);
                    }
                }).forEach(element -> System.out.print(element + " "));
    }
}

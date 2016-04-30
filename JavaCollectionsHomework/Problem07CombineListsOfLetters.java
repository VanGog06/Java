/*
Write a program that reads two lists of letters l1 and l2 and combines them: appends all letters c from l2 to the end
of l1, but only when c does not appear in l1. Print the obtained combined list. All lists are given as sequence of
letters separated by a single space, each at a separate line. Use ArrayList<Character> of chars to keep the input and
output lists. Examples:

Input	                                Output
h e l l o                               h e l l o w
l o w

a b c d                                 a b c d x y z
x y z

a b a                                   a b a
b a b a

w e l c o m e t o s o f t u n i         w e l c o m e t o s o f t u n i j a v a p r g r a g
j a v a p r o g r a m m i n g
 */

import java.util.*;

public class Problem07CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] firstInput = sc.nextLine().toCharArray();
        char[] secondInput = sc.nextLine().toCharArray();

        ArrayList<Character> firstList = new ArrayList<>();
        ArrayList<Character> secondList = new ArrayList<>();
        ArrayList<Character> finalList = new ArrayList<>();

        for (char c : firstInput) {
            if (c != ' ') {
                firstList.add(c);
                finalList.add(c);
            }
        }

        for (char c : secondInput) {
            if (c != ' ') {
                secondList.add(c);
            }
        }

        for (int i = 0; i < secondList.size(); i++) {
            if ((!firstList.contains(secondList.get(i))) && (!secondList.get(i).equals(" "))) {
                finalList.add(secondList.get(i));
            }
        }

        System.out.println(finalList);
    }
}

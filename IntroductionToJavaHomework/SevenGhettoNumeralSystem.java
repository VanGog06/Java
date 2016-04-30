/*
 Write a program that converts the decimal number system to the ghetto numeral system. In the ghetto, numbers are
 represented as following:

	0 – Gee
	1 – Bro
	2 – Zuz
	3 – Ma
	4 – Duh
	5  - Yo
	6 – Dis
	7 – Hood
	8 – Jam
	9 – Mack

Input	Output
6781	DisHoodJamBro
9374	MackMaHoodDuh
533	    YoMaMa
102	    BroGeeZuz
 */

import java.util.Scanner;

public class SevenGhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String output = "";

        while(input >= 1) {
            switch (input % 10) {
                case 0:
                    output = "Gee" + output;
                    break;
                case 1:
                    output = "Bro" + output;
                    break;
                case 2:
                    output = "Zuz" + output;
                    break;
                case 3:
                    output = "Ma" + output;
                    break;
                case 4:
                    output = "Duh" + output;
                    break;
                case 5:
                    output = "Yo" + output;
                    break;
                case 6:
                    output = "Dis" + output;
                    break;
                case 7:
                    output = "Hood" + output;
                    break;
                case 8:
                    output = "Jam" + output;
                    break;
                case 9:
                    output = "Mack" + output;
                    break;
            }

            input /= 10;
        }

        System.out.println(output);
    }
}

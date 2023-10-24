package homework_week7;

import java.util.Scanner;

/**
 * 8.Input any alphabet from “A" to “F” and
 * print their city name accordingly (use if else) if  any other alphabet should be invalid entry
 */

public class Programme_8_PrintCityName {
    public static void main(String[] args) { // main method
        char ab;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Alphabets between A to F : ");
        ab = scanner.next().charAt(0);

        if (ab == 'A' || ab == 'a') {
            System.out.println("A = Akingham");
        } else if (ab == 'B' || ab == 'b') {
            System.out.println("B = Bombay");
        } else if (ab == 'C' || ab == 'c') {
            System.out.println("C = Chennai");
        } else if (ab == 'D' || ab == 'd') {
            System.out.println("D = Delhi");
        } else if (ab == 'E' || ab == 'e') {
            System.out.println("E = Edinburgh");
        } else if (ab == 'F' || ab == 'f') {
            System.out.println("f = Fribourg");
        } else {
            System.out.println("Invalid Alphabets Entered");
        }
    }
}

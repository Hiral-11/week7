package homework_week7;

import java.util.Scanner;

/**
 * 16.Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or  “ZERO”
 */

public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) { // main method

        Scanner scanner = new Scanner(System.in); // calling scanner
        System.out.println("Enter the number : "); // enter number console
        int num = scanner.nextInt(); // call scanner

        if(num > 0) {
            System.out.println(num + " is a positive number");
        }else if (num < 0){
            System.out.println(num + " is a negative number");
        }else {
            System.out.println(num + " is Zero ");
        }
    }
}

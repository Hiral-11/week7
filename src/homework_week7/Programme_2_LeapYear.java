package homework_week7;

import java.util.Scanner;

/** 2.Write a java program to input any year like(ex.2007) and find out if it is leap year or not?
 */

public class Programme_2_LeapYear {
    public static void main(String[] args) { //main method
        int year; //int data
        Scanner scanner = new Scanner(System.in); // call scanner
        System.out.println("Enter your Year"); // enter data in console
        year = scanner.nextInt();
        scanner.close();

        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + " is a Leap Year ");
        }
        else {
            System.out.println(year + " is not a Leap Year");
        }


    }
}


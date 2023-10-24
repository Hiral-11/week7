package homework_week7;

/**
 * 6. Write a java program to input any number and find out if it's odd or even
 */

public class Programme_6_OddEven {
    public static void number(double num) {
        if (num % 2 == 0) { //verify either even or odd number
            System.out.println(num + " is even number");// printing statement if number is even number
        } else {
            System.out.println(num + " is odd number"); // printing statement if number is odd number
        }
    }

    public static void main(String[] args) { // main method
        // calling static method to main method directly
        number(77);
        number(60);
        number(5.5);
        number(0);
        number(-12);
        number(-99);
    }

    }


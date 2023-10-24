package homework_week7;

import java.util.Scanner;

/**1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator ( ? : )
 */
public class Programme_1_OddEvenTernaryOperator { //main method
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = obj.nextInt();
        String Programme1 = (num % 2 == 0) ? "even" : "odd";//
        System.out.println(num + " is " + Programme1);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter any number"); // input any number
        int number = scanner1.nextInt();

        scanner1.close();
        //ternary operator to check number
        String result = number%2==0 ? "Even" : "Odd";

        System.out.println(number + " is "+ result);
    }

}

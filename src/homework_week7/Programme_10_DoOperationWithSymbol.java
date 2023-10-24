package homework_week7;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,  /, *)
 * find addition, Subtraction, multiplication and division according to their symbol  (using if else)
 */

public class Programme_10_DoOperationWithSymbol {
    public static void main(String[] args) {
        char ab;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the operator you want (+, -, *, /): ");
      ab = input.next().charAt(0);
        if (ab == '+'){

            System.out.println("\nAddition of " +num1+ " + " +num2+ " = " + (num1 + num2));
        }
        else if (ab == '-'){
            System.out.println("\nSubtraction of " +num1+ " - " +num2+ " = " + (num1 - num2));
        }
        else if (ab == '*'){
            System.out.println("\nMultiplication of " +num1+ " * " +num2+ " = " + (num1 * num2));
        }
        else if (ab == '/'){
            System.out.println("\nDivision of " +num1+ " / " +num2+ " = " + (num1 / num2));
        }
        else {
            System.out.println("Operator is not available");
        }
    }
}



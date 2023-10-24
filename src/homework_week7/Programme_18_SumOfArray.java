package homework_week7;

/**
 * 18. Write a Java program to sum values of an array
 */

public class Programme_18_SumOfArray {

    public static void main(String[] args) {

        //Declare an array of intergers
        int[] numbers = {10, 20, 30, 40, 50};

        //Declare a variable to store the sum
        int sum = 0;

        // Loop thgrough the array elements and add them to sum
        for (int number : numbers) {
            sum = sum + number;
        }

        //print the sum
        System.out.println("The sum of the array is; " + sum);
    }
}

package homework_week7;

/**
 * Write a Java program to calculate the average value of array elements
 */

public class Programme_19_AverageofArray {
    public static void main(String[] args) {
        // creating array value
        int[] value = {32, 5, 9, 11, 19, 55, 67};

        // introduce variables to store sum and average
        int sum = 0;
        double average;

        //loop through array and add each element to sum
        for (int i = 0; i < value.length; i++) {
            sum += value[i];
        }

        //calculate average
        average = (double) sum / value.length;

        //print average
        System.out.println("Average of array element is: " + average);
    }

}

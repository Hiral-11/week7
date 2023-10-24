package homework_week7;

/**
 * 20. Write a Java program to test if an array contains a specific value
 */

public class Programme_20_ValueInArray {
    public static void main(String[] args) {
        //create integers for array
        int[] value = {1, 2, 5, 8, 12, 15, 19};

        //value for check
        int targetValue = 0;

        // Use boolean variable to store the result
        boolean containsValue = false;

        //loop for array to check if it contains target value
        for (int number : value) {
            if (number == targetValue) {
                containsValue = true;
                break;  //Exit loop
            }
        }

        //print the result
        if (containsValue) {
            System.out.println("The array contain value: " + targetValue); // print statement for array contain value
        } else {
            System.out.println("The array does not contain value: " + targetValue); // print statemnet for array does not contain value
        }
    }

    }


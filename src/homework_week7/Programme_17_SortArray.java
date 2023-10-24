package homework_week7;

import java.util.Arrays;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */

public class Programme_17_SortArray {
    public static void main(String[] args) {
        //sorting a numeric array
        int[] numbericArray = {9,86,78, 25, 45, 12, 0, 35, 99};
        System.out.println("Original numeric Array: " + Arrays.toString(numbericArray));

        //sort numeric array in ascending order
        Arrays.sort(numbericArray);
        System.out.println("Sorted Numberic Array (Ascending): " + Arrays.toString(numbericArray));

        //sorting a string array
        String[] stringArray = {"pink", "purple", "orange", "black", "red", "blue","green","yellow"};
        System.out.println("Original string Array: " + Arrays.toString(stringArray));

        //sorting the array in ascending order
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array (Ascending): " + Arrays.toString(stringArray));

    }
}

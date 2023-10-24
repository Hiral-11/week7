package homework_week7;

import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme_12_FindInputValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input : ");
        char ab = scanner.next().charAt(0);

        if ((ab >+ 'a' && ab <= 'z') || (ab >= 'A' && ab <= 'Z')){
            System.out.println("This is an Alphabet");
        }else if (ab >+ '0' && ab <= '9'){
            System.out.println("This is a Number");
        }else {
            System.out.println("This is a Special Character");
        }
    }
}

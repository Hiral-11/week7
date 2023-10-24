package homework_week7;

import java.util.Scanner;

/**
 *7. Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

 public class Programme_7_SalesCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input sales Id
        System.out.println("Input Sales Id");
        int Id = scanner.nextInt();
        //input the seller's name
        System.out.println("Input Seller's name: ");
        String Name = scanner.next();
        //Input basic salary
        System.out.println("Input basic Salary");
        double salary = scanner.nextDouble();
        //input sales amount
        System.out.println("Input sales amount");
        double amount = scanner.nextDouble();

        if (amount >= 50000){
            System.out.println("Sales Commission is 35%");
        } else if (amount >= 30000) {
            System.out.println("Sales Commission is 20%");
        } else if (amount >= 20000) {
            System.out.println("Sales Commission is 10%");
        } else if (amount <= 10000) {
            System.out.println("Sales Commission is 5%");
        }
    }
}

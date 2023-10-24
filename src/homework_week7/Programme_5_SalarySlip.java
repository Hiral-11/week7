package homework_week7;

import java.util.Scanner;

public class Programme_5_SalarySlip {

    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); // create scanner to read data
        System.out.println("Enter Employee ID: "); // printing a statement
        String EmployeeID = scanner.nextLine(); // going to next line after entering a data
        System.out.println("Enter Employee Name: ");
        String Name = scanner.nextLine();
        System.out.println("Enter Basic Salary: ");
        double BasicSalary = scanner.nextInt();

        //calculation
        double HRA = 10 * BasicSalary / 100;
        double DA = 8 * BasicSalary / 100;
        double TA = 9 * BasicSalary / 100;
        double PF = 20 * BasicSalary / 100;

        // Calculation gross salary
        double grossSalary = BasicSalary + HRA + DA + TA - PF;
        scanner.close(); // scanner close

        //print salary slip with using concatenation
        System.out.println("|-------------------------------------|");
        System.out.println("|             Salary Slip             |");
        System.out.println("|-------------------------------------|");
        System.out.println("| Employee Id     : " + EmployeeID + "     |");
        System.out.println("| Employee Name   : " + Name + "           |");
        System.out.println("|-------------------------------------|");
        System.out.println("| Basic Salary    : " + BasicSalary + "      ");
        System.out.println("| HRA 10%         : " + HRA + "            |");
        System.out.println("| TA 8%           : " + TA + "            |");
        System.out.println("| DA 9%           : " + DA + "            |");
        System.out.println("| PF 20%          : " + PF + "            |");
        System.out.println("--------------------------------------|");
        System.out.println("| Gross Salary    : " + grossSalary + "    |");
        System.out.println("|=====================================|");

    }
}





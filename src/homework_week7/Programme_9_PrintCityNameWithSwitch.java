package homework_week7;

import java.util.Scanner;

/**
 * 9. Switch stament
 *
 */

public class Programme_9_PrintCityNameWithSwitch {
    public static void main(String[] args) {
        char ab;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the alphabets between A to F : ");
        ab = scanner.next().charAt(0);

        switch (ab){
            case 'A':
                    System.out.println("A = Akingham");
                    break;
            case 'B':
                    System.out.println("B = Bombay");
                break;
            case 'C':
                    System.out.println("C = Chennai");
                    break;
            case 'D':
                    System.out.println("D = Delhi");
                    break;
            case 'E':
                    System.out.println("E = Edinburgh");
                    break;
                    case 'F':
                    System.out.println("f = Fribourg");
                    break;
            default:
                System.out.println("Invalid Alphabets");
                }
        }
    }


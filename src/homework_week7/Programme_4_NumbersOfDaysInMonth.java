package homework_week7;

/** 4. Find number of Days in Month
 *
 */

public class Programme_4_NumbersOfDaysInMonth {
    public static boolean isLeapYear(int year) { //main method

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) && (year >= 1 && year <= 9999)) {
            System.out.println("True, " + year + " is leap year"); //print if statement condition is true
            return true; // return statement because method is not valid
        } else if (year <= 1 || year >= 9999) {
            System.out.println("False, " + year + " is not in a range (1-9999)");// print if statment if condition is false
            return false;
        }else {
            System.out.println("False, " + year + " is not a leap year"); //print false statment if condition is false
            return false;
        }

    }

    public static int getDaysInMonth(int month, int year){
        if (year < 0 || year > 9999) {
            System.out.println(-1);
            return -1;
        }

        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: //similar days in month declared together
                System.out.println(31);
                break;

            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                    System.out.println(29);
                }else {
                    System.out.println(28);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11: //similar months declare together
                System.out.println(30);
                break;

            default:
                System.out.println(-1);
        }
        return month;
    }

    public static void main(String[] args) {
        //calling static method in main method
        isLeapYear(-1600); //false
        isLeapYear(1600); //true
        isLeapYear(2017); //false
        isLeapYear(2000); //true

        getDaysInMonth(1, 2020); //31 days
        getDaysInMonth(2, 2020); //29 days
        getDaysInMonth(2, 2018); // 28 days
        getDaysInMonth(-1, 2020); // return -1, because data is invalid
        getDaysInMonth(1, -2020);   // return -1. data is invalid
    }
}



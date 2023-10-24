package homework_week7;

/**
 * 11.Write a java program to print the numbers between 1 to 100 which can be divided by 3  and 5 separately.
 */
public class Programme_11_DivideByThreeAndFive {
    // calling both methods in main method

    public static void main(String[] args) {
        divideBy3();
        dividedBy5();
    }
    public static void divideBy3(){
        System.out.println("Number didvide by 3 between 1 to 100");
        for(int i=1; i<=100; i++){
            if (i % 3 == 0)
                System.out.println(i + " ");
        }
        System.out.println("/n");
    }

//to find numbers which are divisible by 5  from 1 to 100
public static void dividedBy5(){
    System.out.println("Numbers didvide by 5 between 1 to 100 ");
    for(int i=1; i<100; i++){
        if (i % 5 == 0)
            System.out.println(i + " ");
    }
    System.out.println("/n");
}

}


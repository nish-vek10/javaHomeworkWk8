package week8_Homework1;

import java.util.Scanner;

public class T2_MinAndMaxInputChallenge {

    public static void main(String[] args) {

        //declare local variables
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in); //create scanner object

        //endless while loop
        while (true) {
            System.out.println("Enter number: ");
            boolean hasNextInt = sc.hasNextInt();

            if (hasNextInt) {
                int number = sc.nextInt();
                sc.nextLine();
                if (number < min) {
                    min = number;
                } else if (number > max) {
                    max = number;
                }
            } else {
                break;
            }
        }
        sc.close(); //close scanner

        if (min == Integer.MAX_VALUE || max == Integer.MIN_VALUE) {
            System.out.println("ERROR!");
        } else {
            System.out.println("MIN: " + min);
            System.out.println("MAX: " + max);
        }
    }
}

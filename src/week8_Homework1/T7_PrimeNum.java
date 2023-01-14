package week8_Homework1;

import java.util.Scanner;

public class T7_PrimeNum {
    //Main method
    public static void main(String args[]) {
        isPrime(); //call static method
    }

    static void isPrime() {
        Scanner sc = new Scanner(System.in); //create object
        System.out.print("Enter an Integer: "); //request user input
        int n = sc.nextInt(); //userInput
        System.out.println("\n");
        int i, m = 0, flag = 0; //declare variables
        m = n / 2;
        if (n == 0 || n == 1) { //0 nd 1 are not prime numbers
            System.out.println(n + " is NOT A PRIME NUMBER.");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is NOT A PRIME NUMBER.");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is PRIME NUMBER.");
            }
        }
    }
}

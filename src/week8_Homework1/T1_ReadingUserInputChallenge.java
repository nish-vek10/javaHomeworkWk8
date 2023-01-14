package week8_Homework1;

import java.util.Scanner;

public class T1_ReadingUserInputChallenge {
/*
    > Read 10 numbers from the console entered by the user and print the sum of those numbers
    > Use hasNextInt() method from the scanner to check if the user entered  an int value
    > if hasNextInt() returns false, print the message "Invalid number", continue reading until you have read 10 numbers
    > Before the user enter each number, print the message "Enter number #X:" where X represent the count 1, 2, 3 ...
 */

    //Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //create scanner object

        int count = 1; //create counter variable
        int sum = 0; //variable to sum up the numbers

        while (count <= 10) {
            System.out.print("Enter number #" + count + " : ");
            boolean validateNumber = sc.hasNextInt();
            if (validateNumber) { //if true
                int number = sc.nextInt(); //userInput for integer
                sum += number; //add the input number to previously summed numbers
                count++; //increment counter by one after each loop
            } else {
                System.out.println("Invalid number"); //print error message if anything other than integer is used
            }
            sc.nextLine(); //return new userInput
        }
        System.out.println("\nSum of all numbers = " + sum); //print the sum
        sc.close(); //close scanner
    }
}


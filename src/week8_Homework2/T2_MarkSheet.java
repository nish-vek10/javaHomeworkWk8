package week8_Homework2;

import java.util.Scanner;

public class T2_MarkSheet {
/*
        2. Rewrite the student mark sheet program using if else and while loop.
 */
    //input Anish Vekaria for name and a two-digit number for roll number for perfect alignment of layout pattern

    //Main method
    public static void main(String[] args) {
        m1(); //call static method
    }

    //declare static void
    static void m1() {
        int mathM, sciM, engM; //declare local variables

        Scanner sc = new Scanner(System.in);  //create scanner object

        System.out.print("Input Student Name: "); //print out statement
        String name = sc.nextLine();  //read user input

        System.out.print("Input Student Roll Number: "); //print out statement
        int roll = sc.nextInt();  //read user input

        System.out.print("Input marks for Mathematics: "); //print out statement
        mathM = sc.nextInt();  //read user input

        System.out.print("Input marks for Science: "); //print out statement
        sciM = sc.nextInt();  //read user input

        System.out.print("Input marks for English: "); //print out statement
        engM = sc.nextInt();  //read user input

        //declare local variables
        int sum = mathM + sciM + engM;
        double perc = sum / 3;
        String res;
        String grade;

        //declare range for PASS or FAIL
        if (perc >= 35) {
            res = "Pass";
        } else {
            res = "Fail";
        }

        //declare range for each grades
        if (perc >= 80) {
            grade = "A+";
        } else if (perc >= 60) {
            grade = "A ";
        } else if (perc >= 50) {
            grade = "B ";
        } else if (perc >= 35) {
            grade = "C ";
        } else {
            grade = "D ";
        }

        while (mathM >= 0 && mathM <= 100 && sciM >= 0 && sciM <= 100 && engM >= 0 && engM <= 100) {
            System.out.println("_________________________________");
            System.out.println("|                               |");
            System.out.println("|           MARK SHEET          |");
            System.out.println("|   NAME       : " + name + "  |");
            System.out.println("|   ROLL NO.   :   " + roll + "           |");
            System.out.println("|-------------------------------|");
            System.out.println("|   SUBJECTS   :   MARKS        |");
            System.out.println("|-------------------------------|");
            System.out.println("|   MATHS      :   " + mathM + "           |");
            System.out.println("|   SCIENCE    :   " + sciM + "           |");
            System.out.println("|   ENGLISH    :   " + engM + "           |");
            System.out.println("|-------------------------------|");
            System.out.println("|   TOTAL      :   " + sum + "          |");
            System.out.println("|-------------------------------|");
            System.out.println("|   PERCENTAGE :   " + String.format("%.1f", perc) + "         |");
            System.out.println("|   RESULT     :   " + res + "         |");
            System.out.println("|   GRADE      :   " + grade + "           |");
            System.out.println("|_______________________________|");
            break;
        }

        if (mathM < 0 || sciM < 0 || engM < 0 || mathM > 100 || sciM > 100 || engM > 100) {
            System.out.println(); //skip a line
            System.out.println("Invalid Input, Marks should between 0 and 100"); //print if invalid scores are inputted
        }
    }
}


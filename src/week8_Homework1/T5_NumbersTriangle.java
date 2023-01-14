package week8_Homework1;

public class T5_NumbersTriangle {
/*
        5.  Write a program in Java to display the pattern like a triangle with a number.
            For eg:
            Input number of rows: 10
            Expected Output:
            1
            12
            123
            1234
            12345
            123456
            1234567
            12345678
            123456789
            12345678910
 */

    //Main method
    public static void main(String[] args) {
        //i for rows and j for columns
        //row denotes the number of rows to be printed
        int i, j, rows = 10; //declare local variables
        for (i = 1; i <= rows; i++) //outer loop for rows
        {
            for (j = 1; j <= i; j++) //inner loop for columns
            {
                System.out.print(j); //prints the numbers
            }
            System.out.println(); //skips to a new line
        }
    }
}

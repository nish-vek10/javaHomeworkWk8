package week8_Homework1;

public class T6_CharacterTriangle {
/*
        6.  Display right angle triangle of @ using nested for loops
            @
            @@
            @@@
            @@@@
            @@@@@
 */

    //Main method
    public static void main(String[] args) {
        //i for rows and j for columns
        //row denotes the number of rows to be printed
        int i, j, rows = 5; //declare local variables
        for (i = 1; i <= rows; i++) //outer loop for rows
        {
            for (j = 1; j <= i; j++) //inner loop for columns
            {
                System.out.print("@"); //prints @
            }
            System.out.println(); //skips to a new line
        }
    }
}

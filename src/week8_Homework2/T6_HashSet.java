package week8_Homework2;

import java.util.HashSet;

public class T6_HashSet {
/*
        6.  Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
            Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
            and if else)
 */

    //Main method
    public static void main(String args[]) {
        //Creating HashSet and adding elements
        HashSet<Integer> setInt = new HashSet();
        setInt.add(4);
        setInt.add(7);
        setInt.add(8);
        setInt.add(15);
        System.out.println(setInt); //print collection
        System.out.println(); //skip a line

        for (int i : setInt) { //iterate through the HashSet
            if (i >= 1 && i <= 10) {
                System.out.println(i); //print elements in the range 1 to 10
            }
        }
    }
}

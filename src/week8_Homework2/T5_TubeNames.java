package week8_Homework2;

import java.util.ArrayList;

public class T5_TubeNames {
/*
        5.  Write a Java program to test an array list is empty or not. Define array list with
            underground tube names
 */

    //declare static method
    static void tubeNames() {
        ArrayList<String> tubes = new ArrayList();

        // check if the list is empty or not
        boolean ans = tubes.isEmpty();

        if (ans == true) {
            System.out.println("The ArrayList is empty!");
        } else {
            System.out.println("The ArrayList is not empty!");
        }
        System.out.print("\n");

        //addition of elements to the arraylist
        tubes.add("NORTHERN");
        tubes.add("PICCADILLY");
        tubes.add("METROPOLITAN");
        tubes.add("CENTRAL");
        tubes.add("JUBILEE");
        tubes.add("VICTORIA");
        tubes.add("HAMMERSMITH AND CITY");
        tubes.add("DLR");
        tubes.add("BAKERLOO");
        tubes.add("CIRCLE");
        tubes.add("ELIZABETH");

        // check if the list is empty or not
        ans = tubes.isEmpty();
        if (ans == true) {
            System.out.println("The ArrayList is empty!");
        } else {
            System.out.println("The ArrayList is not empty!");
            System.out.println(tubes);
        }
    }

    //Main method
    public static void main(String[] args) {
        tubeNames(); //call method
    }
}

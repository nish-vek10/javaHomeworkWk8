package week8_Homework2;

import java.util.ArrayList;

public class T3_ColoursArrayList {
/*
        3.  Write a Java program to create a new array list, add some colours(string) and
            printout the collection using for each loop.
 */

    //Main method
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>(); //create an ArrayList object
        colours.add("Red");
        colours.add("Yellow");
        colours.add("Grey");
        colours.add("Purple");
        colours.add("Green");
        colours.add("Orange");
        colours.add("Brown");
        System.out.println("Collection of colours: ");
        System.out.println(colours);
    }
}

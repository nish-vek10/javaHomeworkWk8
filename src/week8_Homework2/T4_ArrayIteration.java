package week8_Homework2;

import java.util.ArrayList;

public class T4_ArrayIteration {
/*
            4.  Write a Java program to iterate through all elements in an array list using
                Iterator.
 */

    //Main method
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList();
        countries.add("JAPAN");
        countries.add("INDIA");
        countries.add("BRAZIL");
        countries.add("MALAYSIA");
        countries.add("SPAIN");
        countries.add("PORTUGAL");
        System.out.println(countries);

        for (String e : countries) {
                System.out.println(e);
        }
    }
}

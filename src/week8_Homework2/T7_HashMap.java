package week8_Homework2;

import java.util.HashMap;

public class T7_HashMap {
/*
            7.  Create a HashMap object called people that will store String keys and Integer
                values: And use for each loop to iterate the value from Map.
 */

    //declare static method
    public static void hash() {
        HashMap<String, Integer> people = new HashMap<>();
        //add value and key to hashmap
        people.put("KRUNAL", 1);
        people.put("PARESH", 2);
        people.put("ANISH", 3);
        people.put("BHAVESH", 4);
        people.put("GUARANG", 5);
        System.out.println(people); //print hashmap
        System.out.println(); //print empty line

        for (HashMap.Entry<String, Integer> set : people.entrySet()) {
            // Printing all elements of a Map
            System.out.println(set.getKey() + " = " + set.getValue());
        }
    }

    //Main method
    public static void main(String[] args) {
        hash(); //call method
    }
}

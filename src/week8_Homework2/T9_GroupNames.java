package week8_Homework2;

import java.util.ArrayList;

public class T9_GroupNames {
/*
        9.  Write program and add all group names in to array and iterates through for
            each loop.
 */

    //Main method
    public static void main(String[] args) {
        ArrayList<String> group = new ArrayList();
        group.add("JAVA");
        group.add("SELENIUM");
        group.add("POSTMAN");
        group.add("REST ASSURED");
        System.out.println(group);

        for (String e : group) {
            if (e.equals("JAVA")) {
                System.out.println(e);
            }
        }
    }
}

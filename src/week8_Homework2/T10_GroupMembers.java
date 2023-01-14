package week8_Homework2;

import java.util.ArrayList;

public class T10_GroupMembers {
/*
            10. Write program and add all group members names in to array and iterates
                through for each loop and print your name.
 */

    //Main method
    public static void main(String[] args) {
        ArrayList<String> javaGroup = new ArrayList();
        ArrayList<String> seleniumGroup = new ArrayList();
        ArrayList<String> postmanGroup = new ArrayList();
        ArrayList<String> restAssuredGroup = new ArrayList();
        javaGroup.add("ANISH");
        javaGroup.add("KRUNAL");
        javaGroup.add("PARESH");
        javaGroup.add("RIDDHI");
        javaGroup.add("NIDDHI");
        javaGroup.add("ANUPAMA");
        seleniumGroup.add("URVI");
        seleniumGroup.add("SONIA");
        seleniumGroup.add("UMANGI");
        seleniumGroup.add("BHUMIKA");
        seleniumGroup.add("DIPALI");
        seleniumGroup.add("KULDIP");
        postmanGroup.add("MAULIK");
        postmanGroup.add("SHEETAL");
        postmanGroup.add("MAITRI");
        postmanGroup.add("HETVI");
        postmanGroup.add("JITEN");
        postmanGroup.add("MINESH");
        postmanGroup.add("KIRTAN");
        restAssuredGroup.add("JIGAR");
        restAssuredGroup.add("SHIVAM");
        restAssuredGroup.add("DHWANIL");
        restAssuredGroup.add("ARPITA");
        restAssuredGroup.add("AXIT");
        System.out.println("JAVA: " + javaGroup);
        System.out.println("SELENIUM: " + seleniumGroup);
        System.out.println("POSTMAN: " + postmanGroup);
        System.out.println("RESTASSURED: " + restAssuredGroup);
        System.out.println();

        for (String e : javaGroup) {
            if (e.equals("ANISH")) {
                System.out.println("My name: " + e);
            }
        }
    }
}

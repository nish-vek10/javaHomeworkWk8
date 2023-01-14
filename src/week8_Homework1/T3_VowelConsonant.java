package week8_Homework1;

import java.util.Scanner;

public class T3_VowelConsonant {

    //Main method
    public static void main(String[] args) {
        //declare variables
        String inputLetter = "";
        Scanner key = new Scanner(System.in); //create a Scanner object
        System.out.print("Enter a letter from the Alphabet: ");
        inputLetter = key.next(); // store the user input
        inputLetter = inputLetter.trim(); //trim it to remove white space

        //check the length
        if (inputLetter.length() == 1) {
            inputLetter = inputLetter.toLowerCase(); //convert inputLetter to lowercase
            //is inputLetter between a and z and not a number or other char
            if (inputLetter.compareTo("a") >= 0) {
                if (inputLetter.equals("a") || inputLetter.equals("e") ||
                        inputLetter.equals("i") || inputLetter.equals("o") || inputLetter.equals("u")) {
                    System.out.println(inputLetter + " is a VOWEL.");
                } else {
                    System.out.println(inputLetter + " is a CONSONANT.");
                }

            } else {
                System.out.println(inputLetter + " is not valid. You might have entered something other than a to z. ");
            }
        } else {
            System.out.println(inputLetter + " is not valid. You either entered more than one letter. ");
        }
    }
}


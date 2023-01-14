package calculate;

import java.util.Scanner;

public class Main extends Calculator {
    //Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        iterate();
        System.out.print("Would you like to do more calculations? Please enter \"Y\" or \"N\": ");
        char input = sc.next().charAt(0);
        System.out.println();

        while (input == 'Y') {
            iterate();
            System.out.print("Would you like to do more calculations? Please enter \"Y\" or \"N\": ");
            input = sc.next().charAt(0);
        }
    }

    //declare static method
    static void iterate() {
        Calculator obj = new Calculator(); //create object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int a = sc.nextInt();
        System.out.print("Enter second Number: ");
        int b = sc.nextInt();
        System.out.print("Please enter one of symbol +,-,*,/: ");
        char c = sc.next().charAt(0);
        obj.calculateResult(a, b, c);
        System.out.println();
    }
}

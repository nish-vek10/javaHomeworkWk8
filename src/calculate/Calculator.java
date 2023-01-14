package calculate;

public class Calculator {

    //declare instance method
    public void addition(int a, int b) {
        int ans = a + b;
        System.out.println("Addition = " + ans);
    }

    //declare instance method
    public void subtraction(int a, int b) {
        int ans = a - b;
        System.out.println("Subtraction = " + ans);
    }

    //declare instance method
    public void multiplication(int a, int b) {
        int ans = a * b;
        System.out.println("Multiplication = " + ans);
    }

    //declare instance method
    public void division(int a, int b) {
        int ans = a / b;
        System.out.println("Division = " + ans);
    }

    void calculateResult(int a, int b, char c) {
        if (c == '+') {
            addition(a, b);
        } else if (c == '-') {
            subtraction(a, b);
        } else if (c == '*') {
            multiplication(a, b);
        } else {
            division(a, b);
        }
    }
}

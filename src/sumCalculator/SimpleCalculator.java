package sumCalculator;

public class SimpleCalculator {
    //declare instance variables
    double firstNumber;
    double secondNumber;

    //declare instance method to get first number
    public double getFirstNumber() {
        return this.firstNumber;
    }

    //declare instance method to get second number
    public double getSecondNumber() {
        return this.secondNumber;
    }

    //declare instance method with parameter to set first number
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    //declare instance method with parameter to set second number
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    //declare instance method to find the sum of two
    public double getAdditionResult() {
        double addResult = firstNumber + secondNumber;
        return addResult;
    }

    //declare instance method to find the difference of two
    public double getSubtractionResult() {
        double subResult = firstNumber - secondNumber;
        return subResult;
    }

    //declare instance method to find the product of two
    public double getMultiplicationResult() {
        double multResult = firstNumber * secondNumber;
        return multResult;
    }

    //declare instance method to find the quotient of two
    public double getDivisionResult() {
        double divResult = firstNumber / secondNumber;
        if (secondNumber == 0) {
            return 0; //return 0 if denominator=0
        } else {
            return divResult; //else return answer
        }
    }

    //Main method
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
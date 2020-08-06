package lesson04;

public class TestCalculator {
    public static void main(String[] args) {
        int test = Calculator.addition(3, 5);
        System.out.println("Expecting 8, method from calculator = " + test);

        double secondTest = Calculator.division(7, 10);
        System.out.println("Expecting something less them 0, method from calculator = "
                + secondTest);
    }
}

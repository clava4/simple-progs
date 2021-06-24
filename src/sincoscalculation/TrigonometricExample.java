package sincoscalculation;

public class TrigonometricExample {

    public static void main(String[] args) {
        final TrigonometricFunctionCalculator calculator = new TrigonometricFunctionCalculator();
        final double result = Math.pow(calculator.sin(2.316497), 2) + Math.pow(calculator.cos(2.316497), 2);
        System.out.println(result);
    }
}

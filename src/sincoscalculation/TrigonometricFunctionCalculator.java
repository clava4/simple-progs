package sincoscalculation;

public class TrigonometricFunctionCalculator {

    private static final int STEPS_NUMBER = 50;
    private static final int EVEN_NUMBER = 2;

    public double sin(double argument) {
        argument = coefficientApplier(argument);
        return calculate(argument, 1, argument, argument);
    }

    public double cos(double argument) {
        argument = coefficientApplier(argument);
        return calculate(argument, -1, 1, 1);
    }

    private double coefficientApplier(double argument) {
        int coefficient = 1;
        if (argument < 0) {
            coefficient = -1;
        }

        while (Math.abs(argument) > 2 * Math.PI) {
            argument -= 2 * Math.PI * coefficient;
        }
        return argument;
    }

    private double calculate(double argument, int functionCoefficient, double addition, double sum) {
        for (int j = 1; j < STEPS_NUMBER; j++) {
            addition = -addition * argument * argument / (EVEN_NUMBER * j) / (EVEN_NUMBER * j + functionCoefficient);
            sum += addition;
        }
        return sum;
    }
}

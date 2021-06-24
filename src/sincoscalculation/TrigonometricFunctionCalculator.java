package sincoscalculation;

public class TrigonometricFunctionCalculator {

    public static void main(String[] args) {

    }

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
        final int STEPSNUMBER = 50;
        final int EVENNUMBER = 2;
        for (int j = 1; j < STEPSNUMBER; j++) {
            addition = -addition * argument * argument / (EVENNUMBER * j) / (EVENNUMBER * j + functionCoefficient);
            sum += addition;
        }
        return sum;
    }

}

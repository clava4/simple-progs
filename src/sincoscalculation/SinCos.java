package sincoscalculation;

import java.util.Scanner;

public class SinCos { // TODO: rename class to TrigonometricFunctionCalculator

    // TODO: add "final" modifiers where it is possible
    // TODO: make all methods private excepts main()
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1 - sin(x)");
        System.out.println("2 - cos(x)");
        /*
        * TODO: we need to use the first principle of the SOLID (Single Responsibility Principle)
        *  and create two different methods cos() and sin() the same as in the Math library instead 12, 13 and 19 lines
        *  For more details see java.lang.Math. Remove redundant lines
         * */
        int sinCosChoice = in.nextInt();

        System.out.println("1 - radian");
        System.out.println("2 - degree");
        int systemChoice = in.nextInt(); // TODO: rename to unitSystem

        System.out.print("x = ");
        double argument = in.nextDouble();

        // TODO: make the same for sin
        System.out.println(cos(argumentChange(argument, systemChoice)));
    }

    public static double argumentChange(double argument, int systemChoice) { // TODO: rename to coefficientApplier
        // TODO: remove this variable and use Math.PI instead
        final double PI = 3.141592653;

        // TODO: extract to separate method, and name it for example UnitApplier, call new method in the main() method after 25 line
        if (systemChoice == 2) {
            argument *= PI / 180;
        }

        // TODO: why do we need this coefficient?
        int coefficient = 1;
        if (argument < 0) {
            coefficient = -1;
        }

        // TODO: why do we need this while?
        while (Math.abs(argument) > 2 * PI) {
            argument -= 2 * PI * coefficient;
        }
        return argument;
    }

    // TODO: create two methods cos() and sin() instead this method (see example of the one is below). Remove "koef" method
    public static int koef(int sinCosChoice) {
         int koef = sinCosChoice == 1 ? 1 : -1;
         return koef;
    }

    // TODO: make the same for sin
    public static double cos(double argument) {
        return calculate(argument, -1, 1, 1);
    }

    // TODO: I renamed from calculation to calculate because methods should be named as verb
    public static double calculate(double argument, int functionCoefficient, double addition, double sum) {
        // TODO: 50 is the magic number, extract it to the constant and name it more understandable. Make the same for 2 number
        for (int j = 1; j < 50; j++) {
            addition = -addition * argument * argument / (2 * j) / (2 * j + functionCoefficient);
            sum += addition;
        }
        return sum;
    }

    // TODO: remove all TODOs after your fixes :)
}

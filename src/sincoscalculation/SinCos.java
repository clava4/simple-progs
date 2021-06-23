package sincoscalculation;

import java.util.Scanner;

public class SinCos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1 - sin(x)");
        System.out.println("2 - cos(x)");
        int sinCosChoice = in.nextInt();

        System.out.println("1 - radian");
        System.out.println("2 - degree");
        int systemChoice = in.nextInt();

        System.out.print("x = ");
        double argument = in.nextDouble();

        System.out.println(calculation(argumentChange(argument, systemChoice), koef(sinCosChoice)));
    }

    public static double argumentChange(double argument, int systemChoice) {
        int coefficient = 1;
        final double PI = 3.141592653;

        if (systemChoice == 2) {
            argument *= PI / 180;
        }

        if (argument < 0) {
            coefficient = -1;
        }

        while (Math.abs(argument) > 2 * PI) {
            argument -= 2 * PI * coefficient;
        }
        return argument;
    }

    public static int koef(int sinCosChoice) {
         int koef = sinCosChoice == 1 ? 1 : -1;
         return koef;
    }

    public static double calculation(double argument, int koef) {
        double addition;
        double sum;

        if (koef == 1) {
            addition = argument;
            sum = argument;
        } else {
            addition = 1;
            sum = 1;
        }
        for (int j = 1; j < 50; j++) {
            addition = -addition * argument * argument / (2 * j) / (2 * j + koef);
            sum += addition;
        }
        return sum;

    }

}

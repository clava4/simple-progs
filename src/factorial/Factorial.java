package factorial;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        final int number = in.nextInt();

        int multiplierFactorial = 1;
        for (int multiplier = 2; multiplier <= number; multiplier++) {
            multiplierFactorial *= multiplier;
        }

        System.out.print("n! = " + multiplierFactorial);
    }
}

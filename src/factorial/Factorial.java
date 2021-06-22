package factorial;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int number = in.nextInt();
        double multiplierFactorial = 1;

        for (int multiplier = 2; multiplier <= number ; multiplier++) {
            multiplierFactorial = multiplierFactorial * multiplier;
        }

        System.out.print("n! = " + multiplierFactorial);
    }

}

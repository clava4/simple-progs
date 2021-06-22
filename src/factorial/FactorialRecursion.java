package factorial;
import java.util.Scanner;

public class FactorialRecursion {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        final int number = in.nextInt();

        System.out.print("n! = " + factorialRecursion(number));
    }

    private static int factorialRecursion(int number) {
        return number > 1
            ? number * factorialRecursion(number - 1)
            : 1;
    }
}
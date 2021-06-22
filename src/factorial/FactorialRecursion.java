package factorial;
import java.util.Scanner;

public class FactorialRecursion {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int number = in.nextInt();

        System.out.print("n! = " + factorialRecursion(number));
    }

    static double factorialRecursion(int number) {

        if (number > 1) {

            return number * factorialRecursion(number - 1);

        } else {

            return 1;
        }
    }
}
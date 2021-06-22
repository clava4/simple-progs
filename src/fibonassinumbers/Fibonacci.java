package fibonassinumbers;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.print("Print № of number (the first is 1): ");
        final int numNumber = in.nextInt();

        int oldNumber = 0;
        int number = 1;
        int sum = 1;
        for (int i = 2; i <= numNumber; i++) {
            sum = number + oldNumber;
            oldNumber = number;
            number = sum;
        }

        System.out.print("Fibonacci number = " + sum);
    }
}
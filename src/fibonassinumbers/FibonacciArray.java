package fibonassinumbers;
import java.util.Scanner;

public class FibonacciArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Print № of number (the first is 1): ");
        int numNumber = in.nextInt();

        int[] number = new int[numNumber];
        number[0] = 1;
        number[1] = 1;
        int sum = 1;
        for (int i = 1; i < numNumber - 1; i++) {
            sum = number[i-1] + number[i];
            number[i + 1] = sum;
        }
        System.out.print("Fibonacci number = " + sum);
    }
}

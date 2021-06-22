package sincoscalculation;
import java.util.Scanner;

public class SinCos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1 - sin(x)");
        System.out.println("2 - cos(x)");
        int choice1 = in.nextInt();

        System.out.println("1 - radian");
        System.out.println("2 - degree");
        int choice2 = in.nextInt();

        System.out.print("x = ");
        double argument = in.nextDouble();

        int koef = 1;
        final double PI = 3.141592653;

        if (choice2 == 2){
            argument = argument * PI / 180;
        }

        if (argument < 0){
            koef = -1;
        }

        while (Math.abs(argument) > 2 * PI){
            argument = argument - 2 * PI * koef;
        }

        double addition;
        double sum;

        if (choice1 == 1) {        //sin(x)
            addition = argument;
            sum = argument;
            for (int j = 1; j < 50; j++) {
                addition = - addition * argument * argument / (2 * j) / (2 * j + 1);
                sum = sum + addition;
            }

        } else {                  //cos(x)
            addition = 1;
            sum = 1;
            for (int j = 1; j < 50; j++) {
                addition = - addition * argument * argument / (2 * j) / (2 * j - 1);
                sum = sum + addition;
            }

        }
        System.out.println(sum);
    }
}
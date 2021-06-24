package sincoscalculation;

public class TrigonometricExample {

    public static void main(String[] args) {
        TrigonometricFunctionCalculator value = new TrigonometricFunctionCalculator();
        double rezult = Math.pow(value.sin(2.316497), 2) + Math.pow(value.cos(2.316497), 2);
        System.out.println(rezult);

    }
}

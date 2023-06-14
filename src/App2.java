import java.util.Random;
// Инициализировал массив
public class App2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] intArray = new int[10];
        for (int i = 0; i < 10; i++) {
            intArray[i] = random.nextInt(10);
        }
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

}

import java.util.Arrays;
import java.util.Scanner;

public class FactorsFinder {

    public static int[] findFactors(int number) {
        int maxSize = 10;
        int[] factors = new int[maxSize];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxSize) {
                    maxSize *= 2;
                    factors = Arrays.copyOf(factors, maxSize);
                }
                factors[index++] = i;
            }
        }

        return Arrays.copyOf(factors, index);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find factors: ");
        int number = scanner.nextInt();

        int[] factors = findFactors(number);
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        scanner.close();
    }
}

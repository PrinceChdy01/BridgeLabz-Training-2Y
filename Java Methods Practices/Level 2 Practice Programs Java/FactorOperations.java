import java.util.Scanner;

public class FactorOperations {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[idx++] = i;
        }

        return factors;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int val : arr) s += val;
        return s;
    }

    public static int product(int[] arr) {
        int p = 1;
        for (int val : arr) p *= val;
        return p;
    }

    public static double sumOfSquares(int[] arr) {
        double s = 0;
        for (int val : arr) s += Math.pow(val, 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int[] factors = findFactors(num);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Sum of factors: " + sum(factors));
        System.out.println("Product of factors: " + product(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));

        scanner.close();
    }
}

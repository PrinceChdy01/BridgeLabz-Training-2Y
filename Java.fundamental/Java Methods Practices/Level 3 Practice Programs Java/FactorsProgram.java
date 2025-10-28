import java.util.Scanner;

public class FactorsProgram {
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors[idx++] = i;
        }
        return factors;
    }

    public static int sum(int[] arr) {
        int s = 0; for (int v: arr) s += v; return s;
    }

    public static long product(int[] arr) {
        long p = 1; for (int v: arr) p *= v; return p;
    }

    public static double sumSquares(int[] arr) {
        double s = 0; for (int v : arr) s += Math.pow(v, 2); return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int[] factors = findFactors(n);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Sum: " + sum(factors));
        System.out.println("Sum of squares: " + sumSquares(factors));
        System.out.println("Product: " + product(factors));
    }
}

import java.util.Scanner;

public class NaturalSum {

    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        else return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n (natural number): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Enter a positive natural number.");
            scanner.close();
            return;
        }

        int recursiveResult = recursiveSum(n);
        int formulaResult = formulaSum(n);

        System.out.println("Sum using recursion: " + recursiveResult);
        System.out.println("Sum using formula: " + formulaResult);
        System.out.println("Both methods produce the same result: " + (recursiveResult == formulaResult));

        scanner.close();
    }
}

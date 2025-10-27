import java.util.Scanner;

public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] {remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Error: Divisor cannot be zero.");
        } else {
            int[] res = findRemainderAndQuotient(number, divisor);
            System.out.println("Quotient: " + res[1]);
            System.out.println("Remainder: " + res[0]);
        }

        scanner.close();
    }
}

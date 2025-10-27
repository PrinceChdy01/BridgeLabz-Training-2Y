import java.util.Scanner;

public class MaxOfThree {

    private static int inputNumber(Scanner scanner, int num) {
        System.out.print("Enter number " + num + ": ");
        return scanner.nextInt();
    }

    private static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = inputNumber(scanner, 1);
        int num2 = inputNumber(scanner, 2);
        int num3 = inputNumber(scanner, 3);

        int max = findMax(num1, num2, num3);
        System.out.println("Maximum number is: " + max);

        scanner.close();
    }
}

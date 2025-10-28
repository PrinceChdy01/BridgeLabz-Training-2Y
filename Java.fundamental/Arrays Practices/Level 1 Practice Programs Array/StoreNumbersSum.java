import java.util.Scanner;

public class StoreNumbersSum {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        int index = 0;
        double total = 0.0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a positive number (0 or negative to stop): ");
            double num = scanner.nextDouble();

            if (num <= 0 || index == 10) {
                break;
            }
            numbers[index++] = num;
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("Sum of numbers: " + total);

        scanner.close();
    }
}

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        int[] frequency = new int[10];

        while (number != 0) {
            int digit = (int)(number % 10);
            frequency[digit]++;
            number /= 10;
        }

        System.out.println("Digit frequency in the number:");
        for (int i = 0; i <= 9; i++) {
            System.out.println(i + ": " + frequency[i]);
        }

        scanner.close();
    }
}

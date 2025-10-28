import java.util.Scanner;

public class NumberSignChecker {
    public static int checkNumber(int num) {
        if (num > 0) return 1;
        else if (num < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        int result = checkNumber(number);
        if(result == 1) System.out.println("Number is positive.");
        else if(result == -1) System.out.println("Number is negative.");
        else System.out.println("Number is zero.");

        scanner.close();
    }
}

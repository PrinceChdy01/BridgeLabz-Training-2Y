import java.util.Scanner;

public class NumberChecker {
    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if(num1 > num2) return 1;
        else if(num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for(int num : numbers) {
            if(isPositive(num)) {
                if(isEven(num)) System.out.println(num + " is positive even.");
                else System.out.println(num + " is positive odd.");
            } else {
                System.out.println(num + " is negative.");
            }
        }

        int comp = compare(numbers[0], numbers[numbers.length - 1]);
        if(comp == 1) System.out.println("First element is greater than last element.");
        else if(comp == 0) System.out.println("First and last elements are equal.");
        else System.out.println("First element is less than last element.");

        scanner.close();
    }
}

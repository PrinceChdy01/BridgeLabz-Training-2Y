import java.util.Scanner;

public class PalindromeChecker {

    private static String inputString(Scanner scanner) {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    private static boolean checkPalindrome(String s) {
        String cleaned = s.replaceAll("\\s", "").toLowerCase();
        return new StringBuilder(cleaned).reverse().toString().equals(cleaned);
    }

    private static void displayResult(boolean isPalindrome) {
        if (isPalindrome) System.out.println("The string is a palindrome.");
        else System.out.println("The string is not a palindrome.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = inputString(scanner);
        boolean result = checkPalindrome(str);
        displayResult(result);

        scanner.close();
    }
}

import java.util.Arrays;

public class NumberChecker4 {

    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] storeDigits(int number) {
        int n = countDigits(number);
        int[] digits = new int[n];
        int temp = Math.abs(number);
        for (int i = n - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n - 1 - i];
        }
        return reversed;
    }

    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversed = reverseArray(digits);
        return arraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 121;
        System.out.println("Number: " + number);

        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        int[] reversed = reverseArray(digits);
        System.out.println("Reversed: " + Arrays.toString(reversed));

        System.out.println("Is palindrome? " + isPalindrome(number));
        System.out.println("Is duck number? " + isDuckNumber(digits));
    }
}

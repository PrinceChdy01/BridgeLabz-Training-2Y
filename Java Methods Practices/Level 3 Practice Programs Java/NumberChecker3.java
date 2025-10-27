import java.util.Arrays;

public class NumberChecker3 {
    
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

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static double sumOfSquares(int[] digits) {
        double sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return (sum != 0 && number % sum == 0);
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freqArray = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freqArray[i][0] = i;
            freqArray[i][1] = 0;
        }
        for (int d : digits) {
            freqArray[d][1]++;
        }
        return freqArray;
    }

    public static void main(String[] args) {
        int number = 21;
        System.out.println("Number: " + number);

        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad number? " + isHarshadNumber(number, digits));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit frequencies:");
        for (int[] freq1 : freq) {
            System.out.println("Digit " + freq1[0] + ": " + freq1[1]);
        }
    }
}

import java.util.Arrays;

public class NumberChecker {

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

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) return true;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += (int) Math.pow(d, power);
        }
        int originalNumber = 0;
        for (int d : digits) {
            originalNumber = originalNumber * 10 + d;
        }
        return sum == originalNumber;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d < largest) {
                secondLargest = d;
            }
        }
        return new int[] {largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d > smallest) {
                secondSmallest = d;
            }
        }
        return new int[] {smallest, secondSmallest};
    }

    // main method to test utility
    public static void main(String[] args) {
        int number = 153; // sample number
        System.out.println("Number: " + number);

        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Digit count: " + countDigits(number));
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(digits));

        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largest[0]);
        System.out.println("Second largest digit: " + ((largest[1] == Integer.MIN_VALUE) ? "None" : largest[1]));

        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallest[0]);
        System.out.println("Second smallest digit: " + ((smallest[1] == Integer.MAX_VALUE) ? "None" : smallest[1]));
    }
}

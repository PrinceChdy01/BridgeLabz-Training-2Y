public class NumberChecker6 {

    public static int sumOfDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum;
    }

    public static boolean isPerfect(int number) {
        return sumOfDivisors(number) == number;
    }

    public static boolean isAbundant(int number) {
        return sumOfDivisors(number) > number;
    }

    public static boolean isDeficient(int number) {
        return sumOfDivisors(number) < number;
    }

    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static boolean isStrong(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        int number = 145;

        System.out.println("Number: " + number);
        System.out.println("Perfect: " + isPerfect(number));
        System.out.println("Abundant: " + isAbundant(number));
        System.out.println("Deficient: " + isDeficient(number));
        System.out.println("Strong: " + isStrong(number));
    }
}

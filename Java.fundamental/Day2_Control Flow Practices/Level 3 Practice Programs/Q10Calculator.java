import java.util.Scanner;

public class Q10Calculator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        double result;

        switch (op) {
            case "+" -> {
                result = first + second;
                System.out.println("Result = " + result);
                }

            case "-" -> {
                result = first - second;
                System.out.println("Result = " + result);
                }

            case "*" -> {
                result = first * second;
                System.out.println("Result = " + result);
                }

            case "/" -> {
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                }

            default -> System.out.println("Invalid Operator!");
        }

    }
    }
}

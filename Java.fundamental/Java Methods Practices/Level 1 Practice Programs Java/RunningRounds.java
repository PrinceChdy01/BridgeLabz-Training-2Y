import java.util.Scanner;

public class RunningRounds {
    public static int calculateRounds(double side1, double side2, double side3, double totalDistanceKm) {
        double perimeter = side1 + side2 + side3; // meters
        double distanceMeters = totalDistanceKm * 1000;
        return (int) Math.ceil(distanceMeters / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1 of triangle (meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 of triangle (meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 of triangle (meters): ");
        double side3 = scanner.nextDouble();

        int rounds = calculateRounds(side1, side2, side3, 5);

        System.out.println("Athlete must complete " + rounds + " rounds to finish 5 km.");

        scanner.close();
    }
}

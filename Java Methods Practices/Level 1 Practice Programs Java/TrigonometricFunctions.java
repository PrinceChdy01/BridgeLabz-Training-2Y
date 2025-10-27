import java.util.Scanner;

public class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angleDegrees) {
        double radians = Math.toRadians(angleDegrees);
        double sinVal = Math.sin(radians);
        double cosVal = Math.cos(radians);
        double tanVal = Math.tan(radians);
        return new double[] {sinVal, cosVal, tanVal};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();

        double[] results = calculateTrigonometricFunctions(angle);
        System.out.printf("Sine: %.4f%nCosine: %.4f%nTangent: %.4f%n", results[0], results[1], results[2]);

        scanner.close();
    }
}

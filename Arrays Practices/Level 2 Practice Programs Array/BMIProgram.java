import java.util.Scanner;

public class BMIProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = scanner.nextInt();

        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmis = new double[n];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                weights[i] = scanner.nextDouble();
            } while (weights[i] <= 0);

            do {
                System.out.print("Enter height (m) of person " + (i + 1) + ": ");
                heights[i] = scanner.nextDouble();
            } while (heights[i] <= 0);

            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] < 18.5) weightStatus[i] = "Underweight";
            else if (bmis[i] < 25) weightStatus[i] = "Normal weight";
            else if (bmis[i] < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obesity";
        }

        System.out.printf("%-10s %-10s %-10s %s%n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %s%n", weights[i], heights[i], bmis[i], weightStatus[i]);
        }

        scanner.close();
    }
}

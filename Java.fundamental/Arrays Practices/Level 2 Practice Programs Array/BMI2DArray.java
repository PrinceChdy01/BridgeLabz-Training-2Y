import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = scanner.nextInt();

        double[][] personData = new double[n][3]; // weight, height, BMI
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                personData[i][0] = scanner.nextDouble();
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter height (m) of person " + (i + 1) + ": ");
                personData[i][1] = scanner.nextDouble();
            } while (personData[i][1] <= 0);

            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            double bmi = personData[i][2];
            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 25) weightStatus[i] = "Normal weight";
            else if (bmi < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obesity";
        }

        System.out.printf("%-10s %-10s %-10s %s%n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %s%n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}

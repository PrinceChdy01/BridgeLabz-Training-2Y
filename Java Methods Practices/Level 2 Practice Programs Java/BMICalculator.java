import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        double[][] personData = new double[10][3]; // weight, height, bmi
        String[] weightStatus = new String[10];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<10; i++) {
            double weight;
            do {
                System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
                weight = scanner.nextDouble();
            } while (weight <= 0);

            double height;
            do {
                System.out.print("Enter height (cm) for person " + (i+1) + ": ");
                height = scanner.nextDouble();
            } while (height <= 0);

            personData[i][0] = weight;
            personData[i][1] = height;

            double heightMeters = height / 100.0;
            double bmi = weight / (heightMeters * heightMeters);
            personData[i][2] = bmi;

            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 25) weightStatus[i] = "Normal weight";
            else if (bmi < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obesity";
        }

        System.out.printf("%-10s %-10s %-10s %s%n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %s%n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}

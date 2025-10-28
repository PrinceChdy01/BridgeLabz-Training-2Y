import java.util.Scanner;

public class StudentGrades {
    public static String calculateGrade(double percentage) {
        if (percentage >= 90) return "A";
        else if (percentage >= 80) return "B";
        else if (percentage >= 70) return "C";
        else if (percentage >= 60) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percentages = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; ) {
            System.out.print("Enter marks for student " + (i + 1) + " in Physics: ");
            double p = scanner.nextDouble();
            System.out.print("Enter marks in Chemistry: ");
            double c = scanner.nextDouble();
            System.out.print("Enter marks in Maths: ");
            double m = scanner.nextDouble();

            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Marks cannot be negative. Please re-enter.");
                continue;
            }
            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;
            i++;
        }

        for (int i = 0; i < n; i++) {
            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3;
            grades[i] = calculateGrade(percentages[i]);
        }

        System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-10.2f %-10s%n", physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }

        scanner.close();
    }
}

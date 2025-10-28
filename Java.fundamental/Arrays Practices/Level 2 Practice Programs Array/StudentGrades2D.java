import java.util.Scanner;

public class StudentGrades2D {
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

        double[][] marks = new double[n][3];
        double[] percentages = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; ) {
                if (j == 0) System.out.print("Enter Physics marks for student " + (i + 1) + ": ");
                else if (j == 1) System.out.print("Enter Chemistry marks: ");
                else System.out.print("Enter Maths marks: ");

                double mark = scanner.nextDouble();

                if (mark < 0) {
                    System.out.println("Marks cannot be negative. Please re-enter.");
                } else {
                    marks[i][j] = mark;
                    j++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            grades[i] = calculateGrade(percentages[i]);
        }

        System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-10.2f %-10s%n", marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        scanner.close();
    }
}

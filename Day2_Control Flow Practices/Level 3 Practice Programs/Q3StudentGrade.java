import java.util.Scanner;

public class Q3StudentGrade {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        int total = physics + chemistry + maths;
        double average = total / 3.0;

        System.out.println("\nAverage Marks = " + average + "%");

        char grade;
        String remarks;

        if (average >= 90) {
            grade = 'A';
            remarks = "Excellent performance!";
        } else if (average >= 75) {
            grade = 'B';
            remarks = "Very Good performance!";
        } else if (average >= 60) {
            grade = 'C';
            remarks = "Good performance!";
        } else if (average >= 50) {
            grade = 'D';
            remarks = "Satisfactory, can improve!";
        } else {
            grade = 'F';
            remarks = "Fail – Needs improvement!";
        }

        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

}
    }
}

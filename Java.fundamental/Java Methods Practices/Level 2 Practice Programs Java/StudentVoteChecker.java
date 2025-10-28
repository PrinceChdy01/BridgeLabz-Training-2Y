import java.util.Scanner;

public class StudentVoteChecker {
    public boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        StudentVoteChecker checker = new StudentVoteChecker();
        int[] ages = new int[10];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<ages.length; i++) {
            System.out.print("Enter age of student " + (i+1) + ": ");
            ages[i] = scanner.nextInt();
        }

        for(int age : ages) {
            if(checker.canStudentVote(age)) {
                System.out.println("The student with age " + age + " can vote.");
            } else {
                System.out.println("The student with age " + age + " cannot vote.");
            }
        }
        scanner.close();
    }
}

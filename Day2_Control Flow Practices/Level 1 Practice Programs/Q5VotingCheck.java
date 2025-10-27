import java.util.Scanner;

public class Q5VotingCheck {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter the person's age: ");
        int age = sc.nextInt();
        
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

    }
    }
}

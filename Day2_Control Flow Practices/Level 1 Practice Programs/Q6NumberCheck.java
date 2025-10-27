import java.util.Scanner;

public class Q6NumberCheck {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

    }
    }
}

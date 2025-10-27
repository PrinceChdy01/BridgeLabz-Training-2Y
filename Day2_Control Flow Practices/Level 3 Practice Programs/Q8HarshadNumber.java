import java.util.Scanner;

public class Q8HarshadNumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;  
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;   
            sum += digit;            
            temp /= 10;              
        }

        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is Not a Harshad Number.");
        }

    }
    }
}

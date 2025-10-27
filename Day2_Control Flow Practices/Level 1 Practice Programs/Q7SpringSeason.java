import java.util.Scanner;

public class Q7SpringSeason {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();

        boolean isSpring = false;

        if ((month == 3 && day >= 20 && day <= 31) ||   
            (month == 4 && day >= 1 && day <= 30)  ||   
            (month == 5 && day >= 1 && day <= 31)  ||   
            (month == 6 && day >= 1 && day <= 20)) {    
            isSpring = true;
        }

        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

    }
    }
}

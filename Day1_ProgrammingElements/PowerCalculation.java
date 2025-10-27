import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){

            int a = input.nextInt();
            int b = input.nextInt();

            double c = Math.pow(a, b);

            System.out.println(c);
        }
    }
}

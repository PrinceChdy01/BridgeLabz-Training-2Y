import java.util.Scanner;

public class SI {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){

            double P = input.nextDouble();
            double R = input.nextDouble();
            double T = input.nextDouble();

            double SI = (P * R * T) / 100;

            System.out.println(SI);
        }
    }
}

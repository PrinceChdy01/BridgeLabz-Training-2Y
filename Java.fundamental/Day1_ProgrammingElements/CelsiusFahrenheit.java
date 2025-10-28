import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){

            double C = input.nextDouble();

            double F = (C*9/5)+32;

            System.out.println(F);
        }
    }
}

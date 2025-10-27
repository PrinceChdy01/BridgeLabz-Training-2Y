import java.util.Scanner;

public class Km2Miles {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){

            double Km = input.nextDouble();

            double Miles = Km/1.6;

            System.out.println(Miles);
        }
    }
}

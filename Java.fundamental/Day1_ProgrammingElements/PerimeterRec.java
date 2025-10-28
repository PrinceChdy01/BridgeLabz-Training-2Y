import java.util.Scanner;

public class PerimeterRec {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){

            double L = input.nextDouble();
            double W = input.nextDouble();
            double P = 2*(L+W);

            System.out.println(P);
        }
    }
    
}

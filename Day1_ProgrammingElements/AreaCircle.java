import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){

            double r = input.nextDouble();

            double area = Math.PI * r*r;

            System.out.println(area);
        }
    }
}

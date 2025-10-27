import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){

            double r = input.nextDouble();
            double h = input.nextDouble();

            double vol = Math.PI * r*r*h;

            System.out.println(vol);
        }
    }
    
}

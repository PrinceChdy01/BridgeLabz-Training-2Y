import java.util.Scanner;

public class FeetsToYardsAndMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();
        double yards = distanceInFeet / 3.0;
        double miles = yards / 1760.0;
        System.out.println("The distance is " + distanceInFeet + " feet, which is " + yards + " yards and " + miles + " miles.");
        input.close();
    }
}


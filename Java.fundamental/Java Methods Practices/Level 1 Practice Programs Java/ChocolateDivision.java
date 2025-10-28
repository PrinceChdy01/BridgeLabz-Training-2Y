import java.util.Scanner;

public class ChocolateDivision {
    public static int[] getQuotientAndRemainder(int numberOfChocolates, int numberOfChildren) {
        int quotient = numberOfChocolates / numberOfChildren;
        int remainder = numberOfChocolates % numberOfChildren;
        return new int[] {quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = scanner.nextInt();

        System.out.print("Enter number of children: ");
        int children = scanner.nextInt();

        if (children == 0) {
            System.out.println("Number of children cannot be zero.");
        } else {
            int[] result = getQuotientAndRemainder(chocolates, children);
            System.out.println("Each child gets: " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        scanner.close();
    }
}

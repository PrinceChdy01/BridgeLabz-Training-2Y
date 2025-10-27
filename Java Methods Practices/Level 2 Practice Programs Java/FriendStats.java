import java.util.Scanner;

public class FriendStats {

    public static int findYoungestIndex(int[] ages) {
        int minIndex = 0;
        for(int i = 1; i < ages.length; i++) {
            if(ages[i] < ages[minIndex]) minIndex = i;
        }
        return minIndex;
    }

    public static int findTallestIndex(double[] heights) {
        int maxIndex = 0;
        for(int i = 1; i < heights.length; i++) {
            if(heights[i] > heights[maxIndex]) maxIndex = i;
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for(int i=0; i<3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height for " + names[i] + " in cm: ");
            heights[i] = scanner.nextDouble();
        }

        int youngest = findYoungestIndex(ages);
        int tallest = findTallestIndex(heights);

        System.out.println("Youngest friend: " + names[youngest]);
        System.out.println("Tallest friend: " + names[tallest]);

        scanner.close();
    }
}

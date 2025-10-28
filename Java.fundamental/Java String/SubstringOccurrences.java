import java.util.Scanner;

public class SubstringOccurrences {
    public static int countOccurrences(String str, String substr) {
        int count = 0;
        int fromIndex = 0;

        while ((fromIndex = str.indexOf(substr, fromIndex)) != -1) {
            count++;
            fromIndex += substr.length();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring to search: ");
        String subString = scanner.nextLine();

        int occurrences = countOccurrences(mainString, subString);
        System.out.println("The substring \"" + subString + "\" occurs " + occurrences + " times.");

        scanner.close();
    }
}

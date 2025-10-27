import java.util.Scanner;

public class RemoveCharacter {
    public static String removeChar(String str, char ch) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ch) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter a character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        String result = removeChar(input, charToRemove);
        System.out.println("String after removing '" + charToRemove + "': " + result);

        scanner.close();
    }
}

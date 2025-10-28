import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentCharacter {
    public static char mostFrequentChar(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        char mostFrequent = ' ';
        int maxCount = 0;

        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            if (frequencyMap.get(ch) > maxCount) {
                mostFrequent = ch;
                maxCount = frequencyMap.get(ch);
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char result = mostFrequentChar(input);
        System.out.println("Most Frequent Character: '" + result + "'");

        scanner.close();
    }
}

public class WordReplacer {
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        if (sentence == null) return null;
        return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
    }

    public static void main(String[] args) {
        String sentence = "Java is a popular programming language. Java is widely used.";
        String oldWord = "Java";
        String newWord = "Python";

        String result = replaceWord(sentence, oldWord, newWord);
        System.out.println("Original: " + sentence);
        System.out.println("Replaced: " + result);
    }
}

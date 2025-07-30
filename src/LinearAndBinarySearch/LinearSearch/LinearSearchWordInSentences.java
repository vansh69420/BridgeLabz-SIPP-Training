package LinearAndBinarySearch.LinearSearch;


public class LinearSearchWordInSentences {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) return sentence;
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {"Hello world", "Java is fun", "I love coding"};
        System.out.println(findSentenceWithWord(sentences, "Java")); // Output: Java is fun
    }
}

package Day5_JavaString;
import java.util.*;
public class WordAnalyzer {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        String[] words = splitText(sentence);
        String[][] wordsWithLength = getWordsWithLength(words);
        int[] minMax = findShortestAndLongest(wordsWithLength);
        
        System.out.println("Shortest word: " + words[minMax[0]] + " (length: " + minMax[1] + ")");
        System.out.println("Longest word: " + words[minMax[2]] + " (length: " + minMax[3] + ")");
    }
    
    public static String[] splitText(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        
        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIndex] = text.substring(start);
        
        return words;
    }
    
    public static String[][] getWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getWordLength(words[i]));
        }
        return result;
    }
    
        public static int getWordLength(String word) {
        int length = 0;
        try {
            while (true) {
                word.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return length;
        }
    }
    
        public static int[] findShortestAndLongest(String[][] wordsWithLength) {
        int shortestIndex = 0, shortestLength = Integer.MAX_VALUE;
        int longestIndex = 0, longestLength = Integer.MIN_VALUE;
        
        for (int i = 0; i < wordsWithLength.length; i++) {
            int length = Integer.parseInt(wordsWithLength[i][1]);
            if (length < shortestLength) {
                shortestLength = length;
                shortestIndex = i;
            }
            if (length > longestLength) {
                longestLength = length;
                longestIndex = i;
            }
        }
        
        return new int[]{shortestIndex, shortestLength, longestIndex, longestLength};
    }
}

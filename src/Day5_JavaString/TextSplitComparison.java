package Day5_JavaString;
import java.util.*;
public class TextSplitComparison {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        String[] customSplit = splitTextCustom(sentence);
        String[] builtInSplit = sentence.split(" ");
        
        System.out.println("Custom split:");
        printArray(customSplit);
        System.out.println("\nBuilt-in split:");
        printArray(builtInSplit);
        
        boolean areEqual = compareArrays(customSplit, builtInSplit);
        System.out.println("\nArrays are equal: " + areEqual);
    }
    
    public static String[] splitTextCustom(String text) {
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
    
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    
    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print("[" + s + "] ");
        }
    }
}

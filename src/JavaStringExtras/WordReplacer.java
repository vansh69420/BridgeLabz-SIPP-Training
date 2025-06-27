package JavaStringExtras;
import java.util.*;
public class WordReplacer {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter word to replace: ");
        String oldWord = scanner.nextLine();
        System.out.print("Enter new word: ");
        String newWord = scanner.nextLine();
        
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                words[i] = newWord;
            }
        }
        
        String result = String.join(" ", words);
        System.out.println("Modified sentence: " + result);
    }
}

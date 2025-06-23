package Day5_JavaString;
import java.util.*;
public class VowelConsonantCounter {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int[] counts = countVowelsAndConsonants(input);
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
        System.out.println("Non-letters: " + counts[2]);
    }
    
    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0, nonLetters = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String type = checkCharacterType(c);
            
            switch (type) {
                case "Vowel": vowels++; break;
                case "Consonant": consonants++; break;
                default: nonLetters++; break;
            }
        }
        
        return new int[]{vowels, consonants, nonLetters};
    }
    
    public static String checkCharacterType(char c) {
        if (!Character.isLetter(c)) {
            return "Not a Letter";
        }
        
        c = Character.toLowerCase(c);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel";
        } else {
            return "Consonant";
        }
    }
}

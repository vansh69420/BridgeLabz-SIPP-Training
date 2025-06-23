package Day5_JavaString;
import java.util.*;
public class VowelConsonantChecker {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String[][] analysis = analyzeCharacters(input);
        displayAnalysis(analysis);
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
    
    public static String[][] analyzeCharacters(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = checkCharacterType(c);
        }
        return result;
    }
    
    public static void displayAnalysis(String[][] analysis) {
        System.out.println("+---------+--------------+");
        System.out.println("| Character |    Type     |");
        System.out.println("+---------+--------------+");
        for (String[] row : analysis) {
            System.out.printf("|    %-4s | %-12s |\n", row[0], row[1]);
        }
        System.out.println("+---------+--------------+");
    }
}

package Day5_JavaString;
import java.util.*;
public class LowercaseComparison {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String customLower = toLowerCaseCustom(input);
        String builtInLower = input.toLowerCase();
        
        System.out.println("Custom lowercase: " + customLower);
        System.out.println("Built-in lowercase: " + builtInLower);
        
        boolean areEqual = compareStrings(customLower, builtInLower);
        System.out.println("Strings are equal: " + areEqual);
    }
    
    public static String toLowerCaseCustom(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32);
            }
            result.append(c);
        }
        return result.toString();
    }
    
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

package Day5_JavaString;
import java.util.*;
public class StringComparison {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String customUpper = toUpperCaseCustom(input);
        String builtInUpper = input.toUpperCase();
        
        System.out.println("Custom uppercase: " + customUpper);
        System.out.println("Built-in uppercase: " + builtInUpper);
        
        boolean areEqual = compareStrings(customUpper, builtInUpper);
        System.out.println("Strings are equal: " + areEqual);
    }
    
        public static String toUpperCaseCustom(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - 32);
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

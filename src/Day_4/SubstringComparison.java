package Day_4;
import java.util.*;
public class SubstringComparison {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.next();
        System.out.print("Enter start index: ");
        int start = input.nextInt();
        System.out.print("Enter end index: ");
        int end = input.nextInt();
        
        String customSub = createSubstring(text, start, end);
        String builtInSub = text.substring(start, end);
        
        System.out.println("Custom substring: " + customSub);
        System.out.println("Built-in substring: " + builtInSub);
        System.out.println("Substrings match: " + compareWithCharAt(customSub, builtInSub));
    }
    
    public static String createSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end && i < str.length(); i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
    
    public static boolean compareWithCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
}

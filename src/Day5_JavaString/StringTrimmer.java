package Day5_JavaString;
import java.util.*;
public class StringTrimmer {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = scanner.nextLine();
        
        int[] bounds = findTrimBounds(input);
        String customTrim = substringCustom(input, bounds[0], bounds[1]);
        String builtInTrim = input.trim();
        
        System.out.println("Custom trim: [" + customTrim + "]");
        System.out.println("Built-in trim: [" + builtInTrim + "]");
        
        boolean areEqual = compareStrings(customTrim, builtInTrim);
        System.out.println("Strings are equal: " + areEqual);
    }
    
    public static int[] findTrimBounds(String str) {
        int start = 0;
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }
        
        int end = str.length() - 1;
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }
        
        return new int[]{start, end + 1};
    }
    
    public static String substringCustom(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
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

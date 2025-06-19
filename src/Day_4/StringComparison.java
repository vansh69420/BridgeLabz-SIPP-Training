package Day_4;
import java.util.*;
public class StringComparison {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = input.next();
        System.out.print("Enter second string: ");
        String str2 = input.next();
        
        boolean customResult = compareWithCharAt(str1, str2);
        boolean builtInResult = str1.equals(str2);
        
        System.out.println("Custom charAt() comparison: " + customResult);
        System.out.println("Built-in equals() comparison: " + builtInResult);
        System.out.println("Results match: " + (customResult == builtInResult));
    }
    
    public static boolean compareWithCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

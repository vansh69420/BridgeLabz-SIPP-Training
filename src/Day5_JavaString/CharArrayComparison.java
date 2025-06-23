package Day5_JavaString;
import java.util.*;
public class CharArrayComparison {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        char[] customChars = getCharactersCustom(input);
        char[] builtInChars = input.toCharArray();
        
        System.out.println("Custom characters: " + new String(customChars));
        System.out.println("Built-in characters: " + new String(builtInChars));
        
        boolean areEqual = compareCharArrays(customChars, builtInChars);
        System.out.println("Arrays are equal: " + areEqual);
    }
    
    public static char[] getCharactersCustom(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }
    
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}

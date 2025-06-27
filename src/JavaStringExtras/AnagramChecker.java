package JavaStringExtras;
import java.util.*;
public class AnagramChecker {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams");
            return;
        }
        
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        System.out.println("Are anagrams: " + Arrays.equals(arr1, arr2));
    }
}

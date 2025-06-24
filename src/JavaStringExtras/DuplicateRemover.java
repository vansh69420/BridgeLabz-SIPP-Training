package JavaStringExtras;
import java.util.*;
public class DuplicateRemover {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        
        StringBuilder result = new StringBuilder();
        for (Character ch : set) {
            result.append(ch);
        }
        System.out.println("After removing duplicates: " + result);
    }
}

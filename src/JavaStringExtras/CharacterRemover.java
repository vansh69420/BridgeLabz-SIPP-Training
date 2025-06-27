package JavaStringExtras;
import java.util.*;
public class CharacterRemover {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter character to remove: ");
        char toRemove = scanner.nextLine().charAt(0);
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != toRemove) {
                result.append(str.charAt(i));
            }
        }
        System.out.println("Modified String: \"" + result + "\"");
    }
}

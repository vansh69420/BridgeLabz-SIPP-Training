package JavaStringExtras;
import java.util.*;
public class CaseToggler {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        StringBuilder toggled = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else {
                toggled.append(Character.toUpperCase(ch));
            }
        }
        System.out.println("Toggled case: " + toggled);
    }
}

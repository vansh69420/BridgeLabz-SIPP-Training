package Day5_JavaString;
import java.util.*;
public class StringLength {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        int customLength = getLengthCustom(input);
        int builtInLength = input.length();
        
        System.out.println("Custom length: " + customLength);
        System.out.println("Built-in length: " + builtInLength);
    }
    
        public static int getLengthCustom(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return length;
        }
    }
}

package Day5_JavaString;
import java.util.*;
public class StringIndexDemo {
	public static void main(String[] args) {
        generateStringIndexException();
        
        handleStringIndexException();
    }
    
    public static void generateStringIndexException() {
        String text = "hello";
        System.out.println(text.charAt(10));
    }
    
    public static void handleStringIndexException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        System.out.print("Enter an index: ");
        int index = scanner.nextInt();
        
        try {
            System.out.println("Character at index " + index + ": " + text.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }
}

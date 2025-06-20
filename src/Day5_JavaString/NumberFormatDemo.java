package Day5_JavaString;
import java.util.*;
public class NumberFormatDemo {
	public static void main(String[] args) {
        generateNumberFormatException();
        
        handleNumberFormatException();
    }
    
    public static void generateNumberFormatException() {
        String text = "abc";
        int number = Integer.parseInt(text);
    }
    
        public static void handleNumberFormatException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String text = scanner.nextLine();
        
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }
}

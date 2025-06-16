package Day_2;
import java.util.*;
public class DigitCounter {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Handle negative numbers by converting to positive
        int num = Math.abs(number);
        
        // Special case for 0
        if (num == 0) {
            System.out.println("Number of digits: 1");
            return;
        }
        
        // Count digits
        int count = 0;
        while (num != 0) {
            num = num / 10;  // Remove the last digit
            count++;         // Increment digit count
        }
        
        System.out.println("Number of digits in " + number + ": " + count);
    }
}

package Day_3;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Take user input for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Handle negative numbers by working with absolute value
        boolean isNegative = number < 0;
        number = Math.abs(number);
        
        // Step 2: Find the count of digits in the number
        int temp = number;
        int digitCount = 0;
        
        if (temp == 0) {
            digitCount = 1; // Special case for 0
        } else {
            while (temp != 0) {
                temp /= 10;
                digitCount++;
            }
        }
        
        // Step 3: Store digits in an array
        int[] digits = new int[digitCount];
        temp = number;
        
        for (int i = 0; i < digitCount; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        
        // Step 4: Create reversed array (not strictly needed but follows hint)
        int[] reversedDigits = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            reversedDigits[i] = digits[digitCount - 1 - i];
        }
        
        // Step 5: Display the reversed number
        System.out.print("Reversed number: ");
        if (isNegative) {
            System.out.print("-");
        }
        
        for (int digit : digits) {
            System.out.print(digit);
        }
        
        System.out.println();
    }
}

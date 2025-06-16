package Day_2;
import java.util.*;
public class GreatestFactorFor {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        if (number <= 1) {
            System.out.println("Please enter a number greater than 1.");
            return;
        }
        
        int greatestFactor = 1;
        
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        
        System.out.println("Greatest factor of " + number + " (besides itself) is " + greatestFactor);
    }
}

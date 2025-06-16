package Day_2;
import java.util.*;
public class FactorsWhile {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        System.out.println("Factors of " + number + ":");
        int counter = 1;
        while (counter < number) {
            if (number % counter == 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}

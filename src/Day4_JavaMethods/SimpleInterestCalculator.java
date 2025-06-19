package Day4_JavaMethods;
import java.util.*;
public class SimpleInterestCalculator {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter Principal amount: ");
        double principal = input.nextDouble();
        
        System.out.print("Enter Rate of interest (% per year): ");
        double rate = input.nextDouble();
        
        System.out.print("Enter Time period (in years): ");
        double time = input.nextDouble();
        
        // Calculate simple interest directly in main
        double interest = (principal * rate * time) / 100;
        
        // Display result
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f%% and Time %.2f years", 
                         interest, principal, rate, time);
        
    }
}

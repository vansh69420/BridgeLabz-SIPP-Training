package Day4_JavaMethods;
import java.util.*;
public class SimpleInterestCalculator {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
                System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter Rate of interest (% per year): ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter Time period (in years): ");
        double time = sc.nextDouble();
        
                double interest = (principal * rate * time) / 100;
        
                System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f%% and Time %.2f years", 
                         interest, principal, rate, time);
        
	}
}

package Day_2;
import java.util.*;
public class BMICalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input weight and height
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = scanner.nextDouble();
        
        // Convert height from cm to meters
        double heightM = heightCm / 100;
        
        // Calculate BMI
        double bmi = weight / (heightM * heightM);
        
        // Determine weight status
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        
        // Display results
        System.out.printf("\nBMI: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);
    }
}

package ProgrammingElements_Level1;
import java.util.Scanner;

public class Height_Conversion {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        double cm = input.nextDouble();
        
        double inches = cm / 2.54;
        double feet = inches / 12;
        inches = inches % 12;
        
        System.out.printf("Your Height in cm is %.2f while in feet is %.0f and inches is %.2f", 
                         cm, feet, inches);
    }
}

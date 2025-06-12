package Day_1;
import java.util.Scanner;

public class Convert_Kilometers_to_Miles {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();
        
        double miles = kilometers * 0.621371;
        System.out.println("Distance in miles: " + miles);
        
        scanner.close();
    }
}

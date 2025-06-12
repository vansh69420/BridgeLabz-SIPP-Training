package Day_1;
import java.util.Scanner;

public class Perimeter_of_a_Rectangle {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        
        scanner.close();
    }

}

package Practice_Problems;
import java.util.Scanner;
public class Area_of_a_Circle {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
        
        scanner.close();
    }

}

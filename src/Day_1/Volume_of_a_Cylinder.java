package Day_1;
import java.util.Scanner;

public class Volume_of_a_Cylinder {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter radius of the cylinder: ");
        double radius = scanner.nextDouble();
        
        System.out.print("Enter height of the cylinder: ");
        double height = scanner.nextDouble();
        
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder: " + volume);
        
        scanner.close();
    }

}

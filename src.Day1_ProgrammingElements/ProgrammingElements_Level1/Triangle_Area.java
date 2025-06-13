package ProgrammingElements_Level1;
import java.util.Scanner;

public class Triangle_Area {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = input.nextDouble();
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle is " + area);
    }
}

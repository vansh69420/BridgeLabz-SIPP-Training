package ProgrammingElements_Level1;
import java.util.Scanner;

public class Square_Side_from_Perimeter {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter perimeter: ");
        double perimeter = input.nextDouble();
        
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}

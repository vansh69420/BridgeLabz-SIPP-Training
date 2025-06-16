package Day1_PracticeProblems.level2;
import java.util.Scanner;

public class SquareSideCalculator {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter perimeter: ");
        double perimeter = input.nextDouble();
        
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}

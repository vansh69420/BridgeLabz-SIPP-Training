package Day1_PracticeProblems.level2;
import java.util.Scanner;

public class TriangleAreaCalculator {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();
        
        double areaCm = 0.5 * base * height;
        double areaIn = areaCm / (2.54 * 2.54);
        
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f", areaIn, areaCm);
    }
}

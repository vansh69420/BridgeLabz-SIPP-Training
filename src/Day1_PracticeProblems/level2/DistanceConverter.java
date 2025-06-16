package Day1_PracticeProblems.level2;
import java.util.Scanner;

public class DistanceConverter {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();
        
        double yards = feet / 3;
        double miles = yards / 1760;
        
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.4f", yards, miles);
    }
}

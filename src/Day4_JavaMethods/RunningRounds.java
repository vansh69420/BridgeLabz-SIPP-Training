package Day4_JavaMethods;
import java.util.*;
public class RunningRounds {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 (m): ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2 (m): ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3 (m): ");
        double c = sc.nextDouble();
        
        int rounds = calculateRounds(a, b, c);
        System.out.println("Rounds needed: " + rounds);
    }
    
    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000; // 5km in meters
        return (int) Math.ceil(distance / perimeter);
    }
}

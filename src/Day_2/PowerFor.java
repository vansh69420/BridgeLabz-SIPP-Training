package Day_2;
import java.util.*;
public class PowerFor {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int number = scanner.nextInt();
        System.out.print("Enter power: ");
        int power = scanner.nextInt();
        
        long result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        
        System.out.println(number + " raised to the power " + power + " is " + result);
    }
}

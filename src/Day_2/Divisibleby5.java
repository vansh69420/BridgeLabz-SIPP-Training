package Day_2;
import java.util.*;
public class Divisibleby5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        boolean isDivisible = num % 5 == 0;
        System.out.println("Is the number " + num + " divisible by 5? " + isDivisible);
    }

}

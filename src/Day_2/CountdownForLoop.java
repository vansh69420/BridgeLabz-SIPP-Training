package Day_2;
import java.util.*;
public class CountdownForLoop {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter countdown start number: ");
        int counter = scanner.nextInt();
        
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Liftoff!");
    }
}

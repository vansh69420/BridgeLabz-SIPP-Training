package Day_3;
import java.util.*;
public class MultiplicationTable {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] results = new int[4];

        for (int i = 6, j = 0; i <= 9; i++, j++) {
            results[j] = number * i;
            System.out.println(number + " * " + i + " = " + results[j]);
        }
    }
}

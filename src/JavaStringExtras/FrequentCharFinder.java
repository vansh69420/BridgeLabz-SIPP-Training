package JavaStringExtras;
import java.util.*;
public class FrequentCharFinder {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        int[] counts = new int[256];
        int max = 0;
        char result = ' ';
        
        for (int i = 0; i < str.length(); i++) {
            counts[str.charAt(i)]++;
            if (counts[str.charAt(i)] > max) {
                max = counts[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        System.out.println("Most Frequent Character: '" + result + "'");
    }
}

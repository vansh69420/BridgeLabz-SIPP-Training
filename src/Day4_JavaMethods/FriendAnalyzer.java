package Day4_JavaMethods;
import java.util.*;
public class FriendAnalyzer {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter " + names[i] + "'s age: ");
            ages[i] = sc.nextInt();
            System.out.print("Enter " + names[i] + "'s height: ");
            heights[i] = sc.nextDouble();
        }
        
        String youngest = findYoungest(names, ages);
        String tallest = findTallest(names, heights);
        
        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);
    }
    
    public static String findYoungest(String[] names, int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) minIndex = i;
        }
        return names[minIndex];
    }
    
    public static String findTallest(String[] names, double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) maxIndex = i;
        }
        return names[maxIndex];
    }
}

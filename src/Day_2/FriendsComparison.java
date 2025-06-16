package Day_2;
import java.util.*;
public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input ages
        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();
        
        // Input heights
        System.out.print("Enter Amar's height: ");
        double amarHeight = scanner.nextDouble();
        System.out.print("Enter Akbar's height: ");
        double akbarHeight = scanner.nextDouble();
        System.out.print("Enter Anthony's height: ");
        double anthonyHeight = scanner.nextDouble();
        
        // Find youngest
        String youngest = "Amar";
        int minAge = amarAge;
        if (akbarAge < minAge) {
            minAge = akbarAge;
            youngest = "Akbar";
        }
        if (anthonyAge < minAge) {
            youngest = "Anthony";
        }
        
        // Find tallest
        String tallest = "Amar";
        double maxHeight = amarHeight;
        if (akbarHeight > maxHeight) {
            maxHeight = akbarHeight;
            tallest = "Akbar";
        }
        if (anthonyHeight > maxHeight) {
            tallest = "Anthony";
        }
        
        System.out.println("The youngest friend is " + youngest);
        System.out.println("The tallest friend is " + tallest);
    }
}

package Day5_JavaString;
import java.util.*;
public class ArrayIndexDemo {
	public static void main(String[] args) {
        generateArrayIndexException();
        
        handleArrayIndexException();
    }
    
    public static void generateArrayIndexException() {
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println(names[5]);
    }
    
    public static void handleArrayIndexException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many names? ");
        int count = scanner.nextInt();
        scanner.nextLine();
        
        String[] names = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i+1) + ": ");
            names[i] = scanner.nextLine();
        }
        
        System.out.print("Enter index to access: ");
        int index = scanner.nextInt();
        
        try {
            System.out.println("Name at index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }
}

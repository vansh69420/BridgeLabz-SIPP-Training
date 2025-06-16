package Day_2;
import java.util.*;
public class GradeCalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input marks for each subject
        System.out.print("Enter Physics marks: ");
        int physics = scanner.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = scanner.nextInt();
        System.out.print("Enter Maths marks: ");
        int maths = scanner.nextInt();
        
        // Calculate average percentage
        double average = (physics + chemistry + maths) / 3.0;
        
        // Determine grade and remarks
        String grade;
        String remarks;
        
        if (average >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }
        
        // Display results
        System.out.println("\nResults:");
        System.out.println("Physics: " + physics);
        System.out.println("Chemistry: " + chemistry);
        System.out.println("Maths: " + maths);
        System.out.printf("Average Marks: %.2f%%\n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}

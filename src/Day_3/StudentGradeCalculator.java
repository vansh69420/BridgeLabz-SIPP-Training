package Day_3;
import java.util.*;
public class StudentGradeCalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Take input for number of students
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        
        // Step 2: Create arrays to store data
        String[] names = new String[numStudents];
        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathsMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        String[] remarks = new String[numStudents];
        
        // Step 3: Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for Student " + (i+1));
            System.out.print("Name: ");
            names[i] = scanner.next();
            
            // Input Physics marks with validation
            while (true) {
                System.out.print("Physics marks: ");
                physicsMarks[i] = scanner.nextInt();
                if (physicsMarks[i] >= 0) break;
                System.out.println("Marks cannot be negative. Please re-enter.");
            }
            
            // Input Chemistry marks with validation
            while (true) {
                System.out.print("Chemistry marks: ");
                chemistryMarks[i] = scanner.nextInt();
                if (chemistryMarks[i] >= 0) break;
                System.out.println("Marks cannot be negative. Please re-enter.");
            }
            
            // Input Maths marks with validation
            while (true) {
                System.out.print("Maths marks: ");
                mathsMarks[i] = scanner.nextInt();
                if (mathsMarks[i] >= 0) break;
                System.out.println("Marks cannot be negative. Please re-enter.");
            }
            
            // Step 4: Calculate percentage
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3.0;
            
            // Determine grade and remarks
            if (percentages[i] >= 80) {
                grades[i] = 'A';
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
                remarks[i] = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
                remarks[i] = "Level 1-, too below agency-normalized standards";
            } else {
                grades[i] = 'R';
                remarks[i] = "Remedial standards";
            }
        }
        
        // Step 5: Display results
        System.out.println("\nStudent Results:");
        System.out.println("----------------------------------------------------------------");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %-10s %-50s\n", 
                         "Name", "Physics", "Chemistry", "Maths", "Percentage", "Grade", "Remarks");
        System.out.println("----------------------------------------------------------------");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-15s %-10d %-10d %-10d %-10.2f %-10c %-50s\n", 
                            names[i], physicsMarks[i], chemistryMarks[i], mathsMarks[i], 
                            percentages[i], grades[i], remarks[i]);
        }
}

package Day5_OOPs.HierarchialInheritance.SchoolSystem;

public class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println(name + " is a Student. Grade: " + grade);
    }
}

package Day5_OOPs.HierarchialInheritance.SchoolSystem;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println(name + " is a Teacher. Subject: " + subject);
    }
}

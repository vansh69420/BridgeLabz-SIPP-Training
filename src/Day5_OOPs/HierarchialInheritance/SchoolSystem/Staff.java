package Day5_OOPs.HierarchialInheritance.SchoolSystem;

public class Staff extends Person {
    private String position;

    public Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    public void displayRole() {
        System.out.println(name + " is a Staff member. Position: " + position);
    }
}
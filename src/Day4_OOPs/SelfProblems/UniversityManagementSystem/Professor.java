package Day4_OOPs.SelfProblems.UniversityManagementSystem;

public class Professor {
    private String name;

    public Professor(String name) { this.name = name; }

    public void assignProfessor(Course c) { c.setProfessor(this); }
}

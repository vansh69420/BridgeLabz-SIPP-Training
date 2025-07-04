package Day4_OOPs.SelfProblems.UniversityManagementSystem;

import java.util.*;

public class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) { this.name = name; }

    public void enrollCourse(Course c) {
        if (!courses.contains(c)) {
            courses.add(c);
            c.addStudent(this);
        }
    }
}

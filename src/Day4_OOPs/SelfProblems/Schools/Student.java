package Day4_OOPs.SelfProblems.Schools;

import java.util.*;

public class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) { this.name = name; }

    public String getName() { return name; }

    public void enroll(Course c) {
        if (!courses.contains(c)) {
            courses.add(c);
            c.addStudent(this);
        }
    }

    public void showCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses) {
            System.out.println(" " + c.getTitle());
        }
    }
}
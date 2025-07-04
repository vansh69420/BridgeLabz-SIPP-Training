package Day4_OOPs.SelfProblems.Schools;

import java.util.*;

public class Course {
    private String title;
    private List<Student> students = new ArrayList<>();

    public Course(String title) { this.title = title; }

    public String getTitle() { return title; }

    public void addStudent(Student s) {
        if (!students.contains(s)) students.add(s);
    }

    public void showStudents() {
        System.out.println("Course: " + title + " has students:");
        for (Student s : students) {
            System.out.println(" " + s.getName());
        }
    }
}

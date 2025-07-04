package Day4_OOPs.SelfProblems.Schools;

import java.util.*;

public class School {
    private String name;
    private List<Student> students = new ArrayList<>();

    public School(String name) { this.name = name; }

    public void addStudent(Student s) { students.add(s); }

    public void showStudents() {
        System.out.println("School: " + name);
        for (Student s : students) {
            System.out.println(" Student: " + s.getName());
        }
    }
}
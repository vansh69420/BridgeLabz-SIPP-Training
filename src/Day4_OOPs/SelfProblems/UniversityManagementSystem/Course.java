package Day4_OOPs.SelfProblems.UniversityManagementSystem;

import java.util.*;

public class Course {
    private String title;
    private Professor professor;
    private List<Student> students = new ArrayList<>();

    public Course(String title) { this.title = title; }

    public void setProfessor(Professor p) { this.professor = p; }

    public void addStudent(Student s) { students.add(s); }
}

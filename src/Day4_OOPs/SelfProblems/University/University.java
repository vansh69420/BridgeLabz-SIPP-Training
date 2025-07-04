package Day4_OOPs.SelfProblems.University;

import java.util.*;

public class University {
    private String name;
    private List<Department> departments = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();

    public University(String name) { this.name = name; }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addFaculty(Faculty f) { faculties.add(f); }

    public void showStructure() {
        System.out.println("University: " + name);
        for (Department d : departments) d.show();
        for (Faculty f : faculties) System.out.println("Faculty: " + f.getName());
    }

    public void deleteUniversity() {
        departments.clear(); // Composition: departments deleted with university
        faculties.clear();   // Aggregation: faculties can exist elsewhere
        System.out.println("University deleted.");
    }
}
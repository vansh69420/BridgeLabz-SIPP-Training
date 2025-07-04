package Day4_OOPs.SelfProblems.Hospital;

import java.util.*;



public class Patient {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();

    public Patient(String name) { this.name = name; }

    public String getName() { return name; }

    public void addDoctor(Doctor d) {
        if (!doctors.contains(d)) doctors.add(d);
    }
}

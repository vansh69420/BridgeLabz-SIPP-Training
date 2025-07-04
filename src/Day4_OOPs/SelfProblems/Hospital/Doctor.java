package Day4_OOPs.SelfProblems.Hospital;

import java.util.*;

public class Doctor {
    private String name;
    private List<Patient> patients = new ArrayList<>();

    public Doctor(String name) { this.name = name; }

    public void consult(Patient p) {
        if (!patients.contains(p)) patients.add(p);
        p.addDoctor(this);
        System.out.println("Doctor " + name + " consults Patient " + p.getName());
    }
}

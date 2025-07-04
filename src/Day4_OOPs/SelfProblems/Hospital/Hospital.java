package Day4_OOPs.SelfProblems.Hospital;

import java.util.*;

public class Hospital {
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    public void addDoctor(Doctor d) { doctors.add(d); }
    public void addPatient(Patient p) { patients.add(p); }
}

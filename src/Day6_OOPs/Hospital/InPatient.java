package Day6_OOPs.Hospital;

import java.util.ArrayList;
import java.util.List;

public class InPatient extends Patient implements MedicalRecord {
    private double roomCharges;
    private List<String> records = new ArrayList<>();
    public InPatient(int id, String name, int age, double roomCharges) {
        super(id, name, age);
        this.roomCharges = roomCharges;
    }
    @Override public double calculateBill() { return roomCharges + 500; }
    @Override public void addRecord(String record) { records.add(record); }
    @Override public void viewRecords() { for (String r : records) System.out.println(r); }
}
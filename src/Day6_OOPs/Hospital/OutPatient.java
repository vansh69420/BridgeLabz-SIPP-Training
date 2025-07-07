package Day6_OOPs.Hospital;

import java.util.ArrayList;
import java.util.List;

public class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();
    public OutPatient(int id, String name, int age, double fee) {
        super(id, name, age);
        this.consultationFee = fee;
    }
    @Override public double calculateBill() { return consultationFee; }
    @Override public void addRecord(String record) { records.add(record); }
    @Override public void viewRecords() { for (String r : records) System.out.println(r); }
}
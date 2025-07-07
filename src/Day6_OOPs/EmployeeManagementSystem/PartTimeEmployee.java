package Day6_OOPs.EmployeeManagementSystem;

public class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void assignDepartment(String deptName) { this.department = deptName; }

    @Override
    public String getDepartmentDetails() { return department; }
}
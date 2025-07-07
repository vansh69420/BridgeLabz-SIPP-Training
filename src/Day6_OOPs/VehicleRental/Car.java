package Day6_OOPs.VehicleRental;

public class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) { super(num, "Car", rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days; }
    @Override public double calculateInsurance() { return 5000; }
    @Override public String getInsuranceDetails() { return "Car insurance"; }
}
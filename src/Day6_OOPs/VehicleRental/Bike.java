package Day6_OOPs.VehicleRental;

public class Bike extends Vehicle implements Insurable {
    public Bike(String num, double rate) { super(num, "Bike", rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days; }
    @Override public double calculateInsurance() { return 1000; }
    @Override public String getInsuranceDetails() { return "Bike insurance"; }
}
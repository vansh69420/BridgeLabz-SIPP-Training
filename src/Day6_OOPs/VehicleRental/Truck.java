package Day6_OOPs.VehicleRental;

public class Truck extends Vehicle implements Insurable {
    public Truck(String num, double rate) { super(num, "Truck", rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days * 1.5; }
    @Override public double calculateInsurance() { return 8000; }
    @Override public String getInsuranceDetails() { return "Truck insurance"; }
}
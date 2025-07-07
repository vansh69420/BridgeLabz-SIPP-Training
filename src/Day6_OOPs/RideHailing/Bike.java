package Day6_OOPs.RideHailing;

public class Bike extends Vehicle implements GPS {
    private String location = "Unknown";
    public Bike(String id, String driver, double rate) { super(id, driver, rate); }
    @Override public double calculateFare(double distance) { return getRatePerKm() * distance * 0.8; }
    @Override public String getCurrentLocation() { return location; }
    @Override public void updateLocation(String newLocation) { location = newLocation; }
}
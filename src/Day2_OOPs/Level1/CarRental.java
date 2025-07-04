package Day2_OOPs.Level1;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate = 1000.0; // Example rate

    public CarRental() {
        this("Unknown", "Standard", 1);
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
}
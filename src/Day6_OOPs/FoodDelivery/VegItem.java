package Day6_OOPs.FoodDelivery;

public class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }
    @Override public double calculateTotalPrice() { return getPrice() * getQuantity(); }
    @Override public void applyDiscount(double percent) { setPrice(getPrice() * (1 - percent/100)); }
    @Override public String getDiscountDetails() { return "Veg discount applied"; }
}
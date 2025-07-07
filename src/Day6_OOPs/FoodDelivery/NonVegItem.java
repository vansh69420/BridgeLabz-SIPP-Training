package Day6_OOPs.FoodDelivery;

public class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }
    @Override public double calculateTotalPrice() { return getPrice() * getQuantity() + 20; }
    @Override public void applyDiscount(double percent) { setPrice(getPrice() * (1 - percent/100)); }
    @Override public String getDiscountDetails() { return "Non-veg discount applied"; }
}
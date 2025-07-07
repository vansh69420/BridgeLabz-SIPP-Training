package Day5_OOPs.MultilevelInheritance.OnlineRetail;

public class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped (Tracking: " + trackingNumber + ")";
    }
}
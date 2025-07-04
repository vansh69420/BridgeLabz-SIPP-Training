package Day1_OOPs.Level2;

import java.util.ArrayList;

public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public static void main(String[] args) {
        ArrayList<CartItem> cart = new ArrayList<>();
        // Add items
        cart.add(new CartItem("Book", 200, 2));
        cart.add(new CartItem("Pen", 10, 5));
        // Remove item (example: remove "Pen")
        cart.removeIf(item -> item.getItemName().equals("Pen"));
        // Display total cost
        double total = 0;
        for (CartItem item : cart) {
            total += item.getTotal();
        }
        System.out.println("Total cost: " + total);
    }
}

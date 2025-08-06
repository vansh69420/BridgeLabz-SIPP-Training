package Collections;



import java.util.*;

public class ShoppingCartDemo {
    public static void main(String[] args) {

        Map<String, Double> priceMap = new HashMap<>();
        priceMap.put("Apple", 1.5);
        priceMap.put("Banana", 0.8);
        priceMap.put("Milk", 2.0);


        Map<String, Integer> cart = new LinkedHashMap<>();
        cart.put("Apple", 2);
        cart.put("Milk", 1);
        cart.put("Banana", 5);

        System.out.println("Cart (order added): " + cart);


        TreeMap<Double, String> sortedByPrice = new TreeMap<>();
        for (String item : cart.keySet()) {
            sortedByPrice.put(priceMap.get(item), item);
        }
        System.out.println("Items sorted by price:");
        for (Map.Entry<Double, String> entry : sortedByPrice.entrySet()) {
            System.out.println(entry.getValue() + " ($" + entry.getKey() + ")");
        }
    }
}
package Day4_OOPs.SelfProblems.ECommercePlatform;

import java.util.*;

public class Customer {
    private String name;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name) { this.name = name; }

    public void placeOrder(Order o) { orders.add(o); }
}

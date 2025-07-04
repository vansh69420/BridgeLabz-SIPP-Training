package Day4_OOPs.AssistedProblems;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void openAccount(Customer customer, double initialBalance) {
        Account acc = new Account(this, initialBalance);
        customer.addAccount(acc);
        customers.add(customer);
        System.out.println("Account opened for " + customer.getName() + " in " + name);
    }

    public String getName() {
        return name;
    }
}

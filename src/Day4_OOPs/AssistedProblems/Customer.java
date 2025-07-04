package Day4_OOPs.AssistedProblems;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        for (Account acc : accounts) {
            System.out.println("Bank: " + acc.getBank().getName() + ", Balance: " + acc.getBalance());
        }
    }

    public String getName() {
        return name;
    }
}

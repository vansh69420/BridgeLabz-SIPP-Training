package Collections;



import java.util.*;

public class BankingSystemDemo {
    public static void main(String[] args) {

        Map<String, Double> accounts = new HashMap<>();
        accounts.put("A100", 5000.0);
        accounts.put("B200", 3000.0);
        accounts.put("C300", 7000.0);


        TreeMap<Double, String> sortedAccounts = new TreeMap<>();
        for (Map.Entry<String, Double> entry : accounts.entrySet()) {
            sortedAccounts.put(entry.getValue(), entry.getKey());
        }
        System.out.println("Accounts sorted by balance:");
        for (Map.Entry<Double, String> entry : sortedAccounts.entrySet()) {
            System.out.println(entry.getValue() + ": $" + entry.getKey());
        }


        Queue<String> withdrawalQueue = new LinkedList<>();
        withdrawalQueue.add("A100");
        withdrawalQueue.add("C300");
        withdrawalQueue.add("B200");

        System.out.println("Processing withdrawals:");
        while (!withdrawalQueue.isEmpty()) {
            String acc = withdrawalQueue.remove();
            System.out.println("Processed withdrawal for account: " + acc);
        }
    }
}

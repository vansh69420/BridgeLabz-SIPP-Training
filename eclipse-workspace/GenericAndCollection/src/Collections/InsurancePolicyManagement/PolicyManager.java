package Collections.InsurancePolicyManagement;


import java.util.*;

public class PolicyManager {
    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();


    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }


    public void displayAllPolicies() {
        System.out.println("All Unique Policies (HashSet):");
        for (Policy p : hashSet) System.out.println(p);
    }


    public void displayExpiringSoon() {
        System.out.println("Policies expiring within 30 days:");
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.DAY_OF_YEAR, 30);
        Date soon = cal.getTime();
        for (Policy p : treeSet) {
            if (!p.getExpiryDate().after(soon) && !p.getExpiryDate().before(now)) {
                System.out.println(p);
            }
        }
    }


    public void displayByCoverageType(String type) {
        System.out.println("Policies with coverage type: " + type);
        for (Policy p : linkedHashSet) {
            if (p.getCoverageType().equalsIgnoreCase(type)) System.out.println(p);
        }
    }


    public void displayDuplicates(List<Policy> policies) {
        System.out.println("Duplicate Policies:");
        Set<String> seen = new HashSet<>();
        for (Policy p : policies) {
            if (!seen.add(p.getPolicyNumber())) System.out.println(p);
        }
    }


    public void comparePerformance(Policy sample) {
        long start, end;
        start = System.nanoTime();
        hashSet.add(sample);
        end = System.nanoTime();
        System.out.println("HashSet add: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.add(sample);
        end = System.nanoTime();
        System.out.println("LinkedHashSet add: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.add(sample);
        end = System.nanoTime();
        System.out.println("TreeSet add: " + (end - start) + " ns");

        start = System.nanoTime();
        hashSet.contains(sample);
        end = System.nanoTime();
        System.out.println("HashSet search: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.contains(sample);
        end = System.nanoTime();
        System.out.println("LinkedHashSet search: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.contains(sample);
        end = System.nanoTime();
        System.out.println("TreeSet search: " + (end - start) + " ns");

        start = System.nanoTime();
        hashSet.remove(sample);
        end = System.nanoTime();
        System.out.println("HashSet remove: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.remove(sample);
        end = System.nanoTime();
        System.out.println("LinkedHashSet remove: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.remove(sample);
        end = System.nanoTime();
        System.out.println("TreeSet remove: " + (end - start) + " ns");
    }

    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();
        Calendar cal = Calendar.getInstance();

        cal.set(2025, Calendar.AUGUST, 10);
        Policy p1 = new Policy("P001", "Alice", cal.getTime(), "Health", 5000);

        cal.set(2025, Calendar.AUGUST, 25);
        Policy p2 = new Policy("P002", "Bob", cal.getTime(), "Auto", 3000);

        cal.set(2025, Calendar.SEPTEMBER, 5);
        Policy p3 = new Policy("P003", "Charlie", cal.getTime(), "Home", 7000);

        cal.set(2025, Calendar.AUGUST, 10);
        Policy p4 = new Policy("P001", "Alice", cal.getTime(), "Health", 5000); // Duplicate

        manager.addPolicy(p1);
        manager.addPolicy(p2);
        manager.addPolicy(p3);
        manager.addPolicy(p4);

        manager.displayAllPolicies();
        manager.displayExpiringSoon();
        manager.displayByCoverageType("Health");
        manager.displayDuplicates(Arrays.asList(p1, p2, p3, p4));

        manager.comparePerformance(p1);
    }
}
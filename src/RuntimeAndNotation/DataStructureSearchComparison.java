package RuntimeAndNotation;

import java.util.*;

public class DataStructureSearchComparison {
    public static void main(String[] args) {
        int N = 1_000_000;
        int[] arr = new int[N];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            arr[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }
        int target = N - 1;

        long start = System.nanoTime();
        boolean found = false;
        for (int x : arr) if (x == target) { found = true; break; }
        long end = System.nanoTime();
        System.out.println("Array search: " + (end - start) / 1e6 + " ms, found: " + found);

        start = System.nanoTime();
        found = hashSet.contains(target);
        end = System.nanoTime();
        System.out.println("HashSet search: " + (end - start) / 1e6 + " ms, found: " + found);

        start = System.nanoTime();
        found = treeSet.contains(target);
        end = System.nanoTime();
        System.out.println("TreeSet search: " + (end - start) / 1e6 + " ms, found: " + found);
    }
}
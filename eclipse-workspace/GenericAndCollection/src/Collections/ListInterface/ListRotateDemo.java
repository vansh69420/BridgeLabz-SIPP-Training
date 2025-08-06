package Collections.ListInterface;

import java.util.*;

public class ListRotateDemo {
    public static <T> void rotate(List<T> list, int k) {
        int n = list.size();
        k = k % n;
        List<T> rotated = new ArrayList<>(list.subList(k, n));
        rotated.addAll(list.subList(0, k));
        for (int i = 0; i < n; i++) list.set(i, rotated.get(i));
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        rotate(nums, 2);
        System.out.println(nums);
    }
}
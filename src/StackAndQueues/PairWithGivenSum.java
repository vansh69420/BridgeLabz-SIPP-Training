package StackAndQueues;

import java.util.*;

public class PairWithGivenSum {
    public static boolean hasPair(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(target - num)) return true;
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        System.out.println(hasPair(arr, 17)); // true
    }
}
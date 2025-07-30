package LinearAndBinarySearch.LinearSearch;

import java.util.Arrays;

public class ChallengeLinearBinarySearch {
    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        boolean[] present = new boolean[n + 2];
        for (int num : arr) {
            if (num > 0 && num <= n + 1) present[num] = true;
        }
        for (int i = 1; i <= n + 1; i++) {
            if (!present[i]) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("First missing positive: " + firstMissingPositive(arr)); // Output: 2
        Arrays.sort(arr);
        System.out.println("Index of 4: " + binarySearch(arr, 4)); // Output: index of 4 in sorted array
    }
}

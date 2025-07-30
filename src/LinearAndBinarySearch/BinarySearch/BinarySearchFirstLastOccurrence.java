package LinearAndBinarySearch.BinarySearch;

public class BinarySearchFirstLastOccurrence {
    public static int[] findFirstLast(int[] arr, int target) {
        int first = -1, last = -1;
        // First occurrence
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        // Last occurrence
        left = 0; right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4,5};
        int[] res = findFirstLast(arr, 2);
        System.out.println(res[0] + ", " + res[1]); // Output: 1, 3
    }
}

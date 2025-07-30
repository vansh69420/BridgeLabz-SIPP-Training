package SortingAlgorithm;


public class MergeSortBookPrices {
    public static void mergeSort(double[] prices, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);
            merge(prices, left, mid, right);
        }
    }

    private static void merge(double[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1, n2 = right - mid;
        double[] L = new double[n1], R = new double[n2];
        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    public static void main(String[] args) {
        double[] prices = {299.99, 199.99, 399.99, 149.99, 249.99};
        mergeSort(prices, 0, prices.length - 1);
        for (double p : prices) System.out.print(p + " ");
    }
}

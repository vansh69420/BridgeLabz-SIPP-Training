package SortingAlgorithm;

public class CountingSortStudentAges {
    public static void countingSort(int[] ages, int minAge, int maxAge) {
        int range = maxAge - minAge + 1;
        int[] count = new int[range];
        for (int age : ages) count[age - minAge]++;
        int idx = 0;
        for (int i = 0; i < range; i++) {
            while (count[i]-- > 0) ages[idx++] = i + minAge;
        }
    }

    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 18, 14, 13, 12, 17};
        countingSort(ages, 10, 18);
        for (int a : ages) System.out.print(a + " ");
    }
}
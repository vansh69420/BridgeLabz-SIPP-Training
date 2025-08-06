package Collections.SetInterface;

import java.util.*;

public class SetToSortedListDemo {
    public static List<Integer> sortedList(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>(Arrays.asList(5,3,9,1));
        System.out.println(sortedList(s));
    }
}
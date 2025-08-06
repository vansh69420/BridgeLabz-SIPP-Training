package Collections.ListInterface;

import java.util.*;

public class LinkedListNthFromEndDemo {
    public static <T> T nthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> first = list.iterator();
        Iterator<T> second = list.iterator();
        for (int i = 0; i < n; i++) {
            if (first.hasNext()) first.next();
            else return null;
        }
        while (first.hasNext()) {
            first.next();
            second.next();
        }
        return second.next();
    }

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println(nthFromEnd(ll, 2)); 
    }
}

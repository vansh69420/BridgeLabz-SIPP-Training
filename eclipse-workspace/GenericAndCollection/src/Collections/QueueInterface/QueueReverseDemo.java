package Collections.QueueInterface;

import java.util.*;

public class QueueReverseDemo {
    public static <T> void reverseQueue(Queue<T> queue) {
        if (queue.isEmpty()) return;
        T item = queue.remove();
        reverseQueue(queue);
        queue.add(item);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10, 20, 30));
        reverseQueue(q);
        System.out.println(q);
    }
}
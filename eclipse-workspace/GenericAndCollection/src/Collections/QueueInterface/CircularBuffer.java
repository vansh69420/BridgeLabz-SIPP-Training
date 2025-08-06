package Collections.QueueInterface;

import java.util.*;

public class CircularBuffer {
    private int[] buffer;
    private int size, start, end, count;

    public CircularBuffer(int capacity) {
        buffer = new int[capacity];
        size = capacity;
        start = 0; end = 0; count = 0;
    }

    public void add(int x) {
        buffer[end] = x;
        end = (end + 1) % size;
        if (count < size) count++;
        else start = (start + 1) % size;
    }

    public List<Integer> getBuffer() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(buffer[(start + i) % size]);
        }
        return result;
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.add(1); cb.add(2); cb.add(3);
        System.out.println(cb.getBuffer());
        cb.add(4);
        System.out.println(cb.getBuffer());
    }
}
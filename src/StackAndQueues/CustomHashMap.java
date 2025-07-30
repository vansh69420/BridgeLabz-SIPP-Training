package StackAndQueues;


import java.util.LinkedList;

public class CustomHashMap<K, V> {
    static class Entry<K, V> {
        K key; V value;
        Entry(K k, V v) { key = k; value = v; }
    }
    private int SIZE = 16;
    private LinkedList<Entry<K, V>>[] table = new LinkedList[SIZE];

    public CustomHashMap() {
        for (int i = 0; i < SIZE; i++) table[i] = new LinkedList<>();
    }

    public void put(K key, V value) {
        int idx = key.hashCode() % SIZE;
        for (Entry<K, V> e : table[idx]) {
            if (e.key.equals(key)) { e.value = value; return; }
        }
        table[idx].add(new Entry<>(key, value));
    }

    public V get(K key) {
        int idx = key.hashCode() % SIZE;
        for (Entry<K, V> e : table[idx]) {
            if (e.key.equals(key)) return e.value;
        }
        return null;
    }

    public void remove(K key) {
        int idx = key.hashCode() % SIZE;
        table[idx].removeIf(e -> e.key.equals(key));
    }

    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        System.out.println(map.get("a")); // 1
        map.remove("a");
        System.out.println(map.get("a")); // null
    }
}

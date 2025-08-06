package Collections.MapInterface;

import java.util.*;

public class KeyWithHighestValue {
    public static String maxKey(Map<String, Integer> map) {
        String maxKey = null;
        int maxVal = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxVal) {
                maxVal = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10); map.put("B", 20); map.put("C", 15);
        System.out.println(maxKey(map));
    }
}
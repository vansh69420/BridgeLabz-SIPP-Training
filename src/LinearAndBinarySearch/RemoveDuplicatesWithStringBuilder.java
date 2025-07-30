package LinearAndBinarySearch;


import java.util.HashSet;

public class RemoveDuplicatesWithStringBuilder {
    public static String removeDuplicates(String input) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (!set.contains(c)) {
                sb.append(c);
                set.add(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "banana";
        System.out.println(removeDuplicates(s)); 
    }
}
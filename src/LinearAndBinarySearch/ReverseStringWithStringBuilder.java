package LinearAndBinarySearch;


public class ReverseStringWithStringBuilder {
    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverse(s));
    }
}

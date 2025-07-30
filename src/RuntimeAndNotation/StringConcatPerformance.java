package RuntimeAndNotation;

public class StringConcatPerformance {
    public static void main(String[] args) {
        int N = 1_000_000;
        String str = "hello";

        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < N; i++) s += str;
        long end = System.nanoTime();
        System.out.println("String concat: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) sb.append(str);
        end = System.nanoTime();
        System.out.println("StringBuilder concat: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < N; i++) sbuf.append(str);
        end = System.nanoTime();
        System.out.println("StringBuffer concat: " + (end - start) / 1e6 + " ms");
    }
}
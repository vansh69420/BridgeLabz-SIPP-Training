package LinearAndBinarySearch;

public class CompareBufferBuilder {
    public static void main(String[] args) {
        int N = 1_000_000;
        String str = "hello";

        long start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < N; i++) sbuf.append(str);
        long end = System.nanoTime();
        System.out.println("StringBuffer time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder();
        for (int i = 0; i < N; i++) sbuilder.append(str);
        end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start) / 1e6 + " ms");
    }
}
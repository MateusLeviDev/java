package A_LeetCode;

import java.util.stream.LongStream;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorialUsingStreams(5));
    }

    public static long factorialUsingStreams(int n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);
    }

    public static int fatorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}

package Recursion;

public class Fibonacci {

    private int num;

    public Fibonacci(int num) {
    }

    public int Calculate(int num) {
        if (num < 2) {
            return 1;
        }
        return Calculate(num - 1) + Calculate(num - 2);
    }

    @Override
    public String toString() {
        return "Fibonacci{" +
                "num=" + num +
                '}';
    }
}

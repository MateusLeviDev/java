package Recursion;

public class Summation {

    public static int Sum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + Sum(num - 1);
    }
}

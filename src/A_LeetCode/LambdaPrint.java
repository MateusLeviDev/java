package A_LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LambdaPrint {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        numbers.forEach(System.out::println);
    }

    public int sum(int x, int y) {
        return x+y;
    }
}

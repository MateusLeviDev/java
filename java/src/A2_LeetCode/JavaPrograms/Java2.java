package A2_LeetCode.JavaPrograms;

import java.util.List;

public class Java2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(8, 9, 7);
        List<Integer> numbers2 = List.of(4, 5, 6);
        double result1 = numbers.stream().mapToInt(n -> n).average().getAsDouble();
        double result2 = numbers2.stream().mapToInt(n -> n).average().getAsDouble();

        System.out.println(result1 + result2);

        System.out.println("***********************************************");

        double salary = 30000;
        double tax = 0.01;
        double increase = salary * tax;
        double total = salary + increase;
        System.out.println(total);
    }
}

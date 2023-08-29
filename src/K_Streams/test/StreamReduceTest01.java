package K_Streams.test;

import java.util.List;

public class StreamReduceTest01 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        integers
                .stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        System.out.println("...................................");

        integers
                .stream()
                .reduce((x, y) -> x * y)
                .ifPresent(System.out::println);
    }
}

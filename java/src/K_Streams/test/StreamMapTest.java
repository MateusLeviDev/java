package K_Streams.test;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamMapTest {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<String> words = List.of("apple", "banana", "cherry");

        List<Integer> cubes = numbers.stream()
                .map(n -> n * n * n)
                .collect(Collectors.toList());
        System.out.println(cubes);

        List<String> upperCase = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCase);
    }
}

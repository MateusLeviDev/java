package K_Streams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StraemTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Goku", "Gomu", "No", "Mi");
        List<String> collect = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}

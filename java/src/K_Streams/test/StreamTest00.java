package K_Streams.test;

import java.util.List;

public class StreamTest00 {
    public static void main(String[] args) {
        List<String> list = List.of("Levi", "Fezao", "Rabe", "Leozao");
        list.stream().findFirst().ifPresent(System.out::println);
    }
}

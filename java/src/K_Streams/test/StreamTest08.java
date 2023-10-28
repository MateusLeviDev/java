package K_Streams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest08 {
    public static void main(String[] args) {
//        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        for (Integer integer : integers) {
//            if(integer % 2 == 0){
//                System.out.print(integer + " ");
//            }
//        }
        IntStream
                .rangeClosed(1,50)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();
        System.out.println(".......................");

        Stream.of("Mateus", "Levi", "Souza", "Pereira")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("........................");

        int[] num = {1,2,3,4,5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        System.out.println();
        System.out.println(".........................");

        try(Stream<String> lines = Files.lines(Paths.get("file.txt"))){
            lines.filter(l -> l.contains("Java"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

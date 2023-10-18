package JavaStreamExercises.aulas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class java8Stream1 {
    public static void main(String[] args) {
        Stream<String> streamOfArray = Stream.of("a", "b", "c");
        //System.out.println(Arrays.toString(streamOfArray.toArray()));

        List<String> collect1 = streamOfArray.filter(element -> element.contains("b")).collect(Collectors.toList());
        System.out.println(collect1);

        List<String> list = Arrays.asList("abc1", "abc2", "abc3");
        long size = list.stream().skip(1)
                .map(element -> element.substring(0, 3)).sorted().count();
        System.out.println(size);

        //            *____________________________________*

        String[] arr = {"a", "b", "c"};
        Stream<String> stream = Arrays.stream(arr);
        Stream<String> stream1 = Arrays.stream(arr, 0, 1);
        System.out.println(Arrays.toString(stream.toArray()));
        System.out.println(Arrays.toString(stream1.toArray()));

        //            *____________________________________*

        Stream<String> limit = Stream.generate(() -> "element").limit(5);
        System.out.println(Arrays.toString(limit.toArray()));

        Stream<Integer> limit1 = Stream.iterate(0, n -> n + 1).limit(10);
        System.out.println(Arrays.toString(limit1.toArray()));

        /*
          boxed(): para converter os elementos da IntStream em objetos Integer
         */
        IntStream range = IntStream.rangeClosed(1, 3);
        List<Integer> collect = range.boxed().collect(Collectors.toList());
        System.out.println(collect);
    }
}

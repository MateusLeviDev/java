package A1_JavaStreamExercises.aulas;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class java8Stream2 {
    public static void main(String[] args) {

        Integer i2 = Stream.of(5, 10, 15).filter(i -> i % 20 == 0).findAny().orElse(0);
        System.out.println(i2);
        List<Integer> collect = Stream.of(2, 4, 6, 8).map(i -> i * i).collect(Collectors.toList());
        System.out.println(collect);
        Integer i1 = Stream.of(1, 2, 3, 4, 5).map(i -> i * 100).findFirst().get();
        System.out.println(i1);

        //            *____________________________________*

        int[] arr = {1,2,3,4,5,6,7,8};
        int reduce = Arrays.stream(arr).reduce(0, Integer::sum);
        System.out.println(reduce);

        /*
          Find the number of carac in a string
         */
        List<String> words = Arrays
                .asList("This is stream reduction example learn well".split(" "));
        int result = words.stream().map(String::length).reduce(0, Integer::sum);
        Optional<Integer> opt = words.stream().map(String::length).reduce(Integer::sum);
        //result = words.stream().reduce(0, (i, str) -> i + str.length(), Integer::sum);
        System.out.println(result);
        System.out.println(opt);

    }

    public static void reduceThreeArgs(List<String> words) {
        int result = words.stream().reduce(0, (p, str) -> {
            System.out.println("BiFunc: " + p + "  " + str);
            return p + str.length();
        }, (i, j) -> {
            System.out.println("BiOpr: " + i + "  " + j);
            return i + j;
        });
    }

}

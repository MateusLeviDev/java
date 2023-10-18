package JavaStreamExercises.aulas;

import JavaStreamExercises.aulas.domain.Product;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExProductStream {
    public static void main(String[] args) throws IOException {
        List<Product> products = new ArrayList<>(List.of(
                new Product(1, "iPhone", 2000, 10),
                new Product(2, "PC", 1000, 5),
                new Product(3, "Car", 10000, 2),
                new Product(4, "House", 20000, 4),
                new Product(5, "Macbook", 1500, 5)
        ));

        List<Double> collect = products.stream()
                .map(Product::getPrice)
                .filter(price -> price >= 10000)
                .collect(Collectors.toList());

        System.out.println(collect);

        //            *____________________________________*

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integerStream
                .filter(i->i % 2 == 0)
                .limit(2)
                .forEach(System.out::println);

        Stream<Integer> integerStream2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Object[] array = integerStream2
                .filter(i -> i % 2 == 0)
                .skip(1)
                .peek(System.out::println)
                .toArray();

        System.out.println(Arrays.toString(array));

        //            *____________________________________*

        List<String> collect1 = Files.lines(Paths.get("file.txt"))
                .map(line -> line.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(collect1);
    }
}

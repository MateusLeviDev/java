package JavaStreamExercises.aulas;

import K_Streams.domain.Category;
import K_Streams.domain.LightNovel;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Aula2 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {



        //just the name
        List<String> collect = lightNovels.stream()
                .distinct()
                .map(LightNovel::getName)
                .collect(toList());

        System.out.println(collect);

        //iteration
        lightNovels
                .forEach(System.out::println);

        List<LightNovel> collect1 = lightNovels.stream()
                .filter(ln -> ln.getCategory() == Category.FANTASY)
                .limit(1)
                .collect(toList());

        System.out.println(collect1);

        System.out.println("*************************************");

        List<String> names = List.of("Levi", "Fezao", "Liliane", "Obama");

        List<Integer> collect2 = names.stream()
                .map(String::length)
                .collect(toList());

        System.out.println(collect2);

        Stream<String> streamOfString =
                Pattern.compile(", ").splitAsStream("a, b, c");

        List<String> collect3 = streamOfString.collect(toList());

        System.out.println(collect3);
    }
}

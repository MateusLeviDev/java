package K_Streams.test;

import K_Streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        lightNovels
                .stream()
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("....................................................");

        lightNovels
                .stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findAny()
                .ifPresent(System.out::println);
    }
}

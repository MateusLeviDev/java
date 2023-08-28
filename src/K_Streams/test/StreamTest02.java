package K_Streams.test;

import K_Streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class    StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    //1. Order LightNovel by title
    //2. Retrieve the first 3 titles light novels with price less than 4
    public static void main(String[] args) {
        List<String> collect = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getName))
                .filter(lightNovel -> lightNovel.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getName) //se ele receber um ln ele pode receber o name. ver function<t, r> doc
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}

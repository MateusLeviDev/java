package K_Streams.test;

import K_Streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
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
        lightNovels.sort(Comparator.comparing(LightNovel::getName));
        List<String> names = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                names.add(lightNovel.getName());
            } if (names.size() >= 3) {
                break;
            }
        }
        System.out.println(lightNovels);
        System.out.println(names);
    }
}

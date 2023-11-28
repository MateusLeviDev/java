package K_Streams.aulas;

import K_Streams.aulas.domain.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Aula3 {
    private static List<Item> items = new ArrayList<>(List.of(
            new Item(1, "Levi"),
            new Item(3, "Zoro"),
            new Item(5, "Neymar"),
            new Item(7, "ViniJR"),
            new Item(10, "Flamengo")
    ));

    public static void main(String[] args) {

        items.stream()
                .filter(i -> i.getId() < 6)
                .forEach(System.out::println);

        System.out.println("********************************");

        IntStream intStream = items.stream()
                .mapToInt(Item::getId);
        intStream.forEach(System.out::println);

        System.out.println("********************************");

        Map<String, String> mapItens = items.stream()
                .collect(Collectors.toMap(
                        i -> i.getId().toString(),
                        Item::getName));
        System.out.println(mapItens);

    }
}

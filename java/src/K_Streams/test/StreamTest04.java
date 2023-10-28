package K_Streams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> mateusLevi = new ArrayList<>();
        List<String> javaDevelopers = List.of("Levi", "Fezao", "Leo");
        List<String> mathTeachers = List.of("Omar", "Liliane");
        List<String> students = List.of("Lucas", "Agenor", "Morena");
        mateusLevi.add(javaDevelopers);
        mateusLevi.add(mathTeachers);
        mateusLevi.add(students);
        mateusLevi.forEach(System.out::println);
        mateusLevi.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}

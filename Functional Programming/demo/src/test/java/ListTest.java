import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListTest {

    @Test
    void test_one() {
        List<String> listOne = Arrays.asList("Jack", "Tom", "Sam", "John", "James", "Jack");
        List<String> listTwo = Arrays.asList("Jack", "Daniel", "Sam", "Alan", "James", "George");

        List<String> differences = listOne.stream()
                .filter(e -> !listTwo.contains(e))
                .toList();

        Assertions.assertEquals(2, differences.size());
    }

    @Test
    void test_two() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 3, 1, 8, 9, 2);
        List<Integer> duplicates = listDuplicateUsingFilterAndSetAdd(list);

        Assertions.assertEquals(3, duplicates.size());
    }

    @Test
    void test_three() {
        List<String> list = Arrays.asList("red", "blue", "blue", "green", "red");
        List<String> otherList = Arrays.asList("red", "green", "green", "yellow");

        Set<String> result = list.stream()
                .filter(otherList::contains)
                .collect(Collectors.toSet());

        Set<String> commonElements = new HashSet<>(Arrays.asList("red", "green"));

        Assertions.assertEquals(commonElements, result);
    }

    @Test
    void test_four() {
        List<Integer> elements = List.of(1, 2, 3, 4, 5, 6, 1, 2, 1);
        int frequency = Collections.frequency(elements, 1);

        Assertions.assertEquals(3, frequency);
    }

    @Test
    void test_five() {
        var vertexCount = 3;
        List<ArrayList<Integer>> graph = IntStream.range(0, vertexCount)
                .mapToObj(i -> new ArrayList<Integer>())
                .toList();

        graph.get(0).add(1);
        graph.get(1).add(2);
        graph.get(2).add(0);

        graph.get(1).add(0);
        graph.get(2).add(1);
        graph.get(0).add(2);

        for (int i = 0; i < vertexCount; i++) {
            int edgeCount = graph.get(i).size();
            for (int j = 0; j < edgeCount; j++) {
                Integer startVertex = i;
                Integer endVertex = graph.get(i).get(j);
                System.out.printf("Vertex %d is connected to vertex %d%n", startVertex, endVertex);
            }
        }
    }

    @Test
    void test_six() {
        List<Integer> elements = List.of(1, 2, 3, 4, 5, 6, 1, 2, 1);
        int frequency = Collections.frequency(elements, 1);

        Assertions.assertEquals(3, frequency);

        Map<Integer, Integer> countMap = elements.stream()
                .collect(Collectors.toMap(
                        e -> e, e -> Collections.frequency(elements, e), (existingValue, newValue) -> existingValue));

        System.out.println(countMap);
    }

    @Test
    void test_seven() {
        List<Integer> elements = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        Collections.rotate(elements, elements.size());

        System.out.println(elements);
    }

    public List<Integer> listDuplicateUsingFilterAndSetAdd(List<Integer> list) {
        HashSet<Integer> elements = new HashSet<>();
        return list.stream()
                .filter(n -> !elements.add(n))
                .sorted()
                .toList();
    }
}

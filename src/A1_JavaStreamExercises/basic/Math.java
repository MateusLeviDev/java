package A1_JavaStreamExercises.basic;

import java.util.List;
import java.util.Optional;

public class Math {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);

        Optional<Integer> sum = list.stream()
                .reduce((a, b) -> a + b);

        System.out.println("Result: " + sum.get());

        //avg
        double asDouble = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println("Result: " + asDouble);

        double asDouble1 = list.stream()
                .map(e -> e * e)
                .filter(e -> e > 10)
                .mapToInt(e -> e)
                .average()
                .getAsDouble();

        System.out.println("Result: " + asDouble1);

    }
}

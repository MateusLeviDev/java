package A1_JavaStreamExercises.aulas;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Vamos imaginar que precisamos encontrar todas as transações do tipo grocery e
 * retornar uma lista de identificações de transações classificadas em ordem decrescente
 * segundo o valor de transação.
 * <p>
 * doc:https://www.oracle.com/br/technical-resources/articles/java/processing-streams-java-se-8.html
 */
public class Aula1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //List<Integer> number2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //list.of sao valores imutaveis, asList voce pode add, rm ou mudar algum numero

        List<Integer> collect = numbers.stream()
                .filter(n -> {
                    System.out.println("filtering: " + n);
                    return n % 2 == 0;
                }).collect(toList());

        System.out.println(collect);

        System.out.println("****************************");

        List<Integer> twoEvenSquares =   numbers.stream()
                .filter(n -> {
                    System.out.println("filtering " + n);
                    return n % 2 == 0;
                })
                .map(n -> {
                    System.out.println("mapping " + n);
                    return n * n;
                })
                //.limit(2)
                .collect(toList());

        System.out.println(twoEvenSquares);
    }
}

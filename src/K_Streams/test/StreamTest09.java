package K_Streams.test;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        Stream.iterate(0,n ->n+2)
                .limit(10)
                .forEach(System.out::println);

        System.out.println(".....................");

        //fibonacci (0,1) (1,1) (1,2) (2,3) (3,5) (5,8)...
        /**
         * vai iniciar um array de i 0,1 onde os valores inciais sao 0 e 1
         * em seguida vai inserir os numeros nesse array
         * cria-se um novo array onde a posição 0 sempre será a posição 1
         * do anterior
         * portanto é feito n[1], n[0]+n[1]
         * feito o cálculo
         */
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(4)
                .map(a -> a[0])
                .forEach(System.out::println);

        System.out.println("...................");

        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(4)
                .forEach(a -> System.out.println(a[0]));

        System.out.println("............................");

        int sum = Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(5)
                .mapToInt(n -> n[0])
                .sum();
        System.out.println(sum);
    }
}

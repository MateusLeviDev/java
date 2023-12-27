package L_Lambda;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTestConsumer {
    public static void main(String[] args) {
        List<String> strings = List.of("Mateus", "Levi", "Souza");
        List<Integer> integers = List.of(1,2,3);
        forEach(strings, s -> System.out.println(s));
        forEach(integers, i -> System.out.println(i));
        System.out.println("----------------------");
        forEach(integers, System.out::println);
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T e : list){
            consumer.accept(e);
        }
    }
}

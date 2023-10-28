package L_Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTestFunction {
    public static void main(String[] args) {
        List<String> strings = List.of("Mateus", "Levi");
        List<Integer> map = map(strings, s -> s.length());
        List<String> map1 = map(strings, s -> s.toUpperCase());
        System.out.println(map);
        System.out.println(map1);

    }

    /**
     *
     * @param <T, R> um tipo de retorno e outro para aceitar como parâmetro
     * @param list queremos retornar uma list de R
     *
     * map vai receber uma lista de T e em seguida o parâmetro que vai receber a function
     */
    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for (T e : list){
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}

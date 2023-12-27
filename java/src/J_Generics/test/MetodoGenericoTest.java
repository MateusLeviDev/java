package J_Generics.test;

import J_Generics.domain.Boat;

import java.util.List;

public class MetodoGenericoTest {
    public static void main(String[] args) {
        List<Boat> barcoList = criarArrayComUmObjeto(new Boat("Canoa Marota"));
        System.out.println(barcoList);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);
    }
//    private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto(T t) {
//        return List.of(t);
//    }

}
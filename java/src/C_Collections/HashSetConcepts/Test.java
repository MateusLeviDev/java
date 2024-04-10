package C_Collections.HashSetConcepts;

import java.util.HashSet;

/*
  @author: levi Apr 1 09:03pm
 */
public class Test {
    /*
        duplicates is not allowed
        insertion order not preserved
        HasCode -> razao pela pesquisa rápida, por que usamos esse conceito
        internamente
        can store different types of objects [heterogeneous]
        and null
        by default store 16 elements

        load factor: add one element
        quando atingir 0,75 do tamanaho ele ira criar outro objeto e os elementos serao criados
        para esse novo objeto

        is a implementation of set e tem seus métodods
         */

    public static void main(String[] args) {

        HashSet<Object> objects = new HashSet<>();
//        HashSet<Object> objects1 = new HashSet<>(100);
//        HashSet<Object> objects2 = new HashSet<>(100, (float) 0.9);

        objects.add("Levi");
        objects.add(null);
        objects.add(25);
        objects.add(87.85);
        objects.add("Santos");
        objects.add(false);

        System.out.println(objects); //[null, 87.85, Santos, false, Levi, 25] not preserved

        objects.remove("Levi");

        System.out.println(objects.contains("levi"));


        //foreach

        objects.forEach(System.out::println);

        //union intersection difference

        HashSet<Object> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        HashSet<Object> set2 = new HashSet<>();
        set2.add(1);
        set2.add(4);
        set2.add(5);

        //union
        set1.addAll(set2);
        set1.forEach(System.out::println);

        //intersection
        set1.retainAll(set2);
        set1.forEach(System.out::println);

        //dff
        set1.removeAll(set2);
        set1.forEach(System.out::println);

    }
}

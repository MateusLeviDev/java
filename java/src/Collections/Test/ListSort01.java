package Collections.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("C");
        mangas.add("E");
        mangas.add("B");
        mangas.add("D");
        mangas.add("A");
        Collections.sort(mangas); //em ordem alfabetica caso string e maior menor se for número um arraylis mantém a ordem do index

        List<Double> moneys = new ArrayList<>();
        moneys.add(23D);
        moneys.add(100.50);
        moneys.add(20.89);
        moneys.add(10D);


        for (String manga : mangas) {
            System.out.println(manga); //mangas
        }
        System.out.println("------------------ SEPARATE ------");
        moneys.forEach(System.out::println);
        Collections.sort(moneys);
        System.out.println("");
        moneys.forEach(System.out::println);
        System.out.println("-----");
        moneys.forEach(money -> {
            System.out.printf("%.2f%n", money); // Imprime os elementos da lista moneys com duas casas decimais
        });
    }
}

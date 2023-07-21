package Collections.Test;

import Collections.Domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Pokemon", 30));
        mangas.add(new Manga(4L, "Dragon Ball", 20));
        mangas.add(new Manga(7L, "Matrix", 55));
        mangas.add(new Manga(2L, "Cidade de Deus", 63));
        mangas.add(new Manga(6L, "Family Guy", 4));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("====================");


        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas, new MangaByIdComparator(   ));
        System.out.println("====================");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}

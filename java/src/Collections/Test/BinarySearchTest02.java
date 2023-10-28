package Collections.Test;

import Collections.Domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Pokemon", 30));
        mangas.add(new Manga(4L, "Dragon Ball", 20));
        mangas.add(new Manga(7L, "Matrix", 55));
        mangas.add(new Manga(2L, "Cidade de Deus", 63));
        mangas.add(new Manga(6L, "Family Guy", 4));
        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}

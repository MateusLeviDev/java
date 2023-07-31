package Collections.Test;

import Collections.Domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Pokemon", 30, 0));
        mangas.add(new Manga(4L, "Dragon Ball", 20, 5));
        mangas.add(new Manga(7L, "Matrix", 55, 0));
        mangas.add(new Manga(2L, "Cidade de Deus", 63, 7));
        mangas.add(new Manga(6L, "Family Guy", 4, 1));
        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()) {
            Manga manga = mangaIterator.next();
            if (manga.getQuantity() == 0) {
                mangaIterator.remove();
            }
        }
        System.out.println(mangas);
    }
}

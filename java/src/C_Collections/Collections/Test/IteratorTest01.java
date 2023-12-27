package C_Collections.Collections.Test;

import C_Collections.Collections.Domain.Manga;

import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Pokemon", 30, 0));
        mangas.add(new Manga(4L, "Dragon Ball", 20, 5));
        mangas.add(new Manga(7L, "Matrix", 55, 0));
        mangas.add(new Manga(2L, "Cidade d  e Deus", 63, 7));
        mangas.add(new Manga(6L, "Family Guy", 4, 1));
//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()) { //enquanto tiver alguém na fila
//            Manga manga = mangaIterator.next();
//            if (manga.getQuantity() == 0) {
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantity() == 0); //a mesma ideia so que agora usando programação funcional
        System.out.println(mangas);
    }
}

package C_Collections.Collections.Test;

import C_Collections.Collections.Domain.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Pokemon", 30, 0));
        mangas.add(new Manga(4L, "Dragon Ball", 20, 5));
        mangas.add(new Manga(7L, "Matrix", 55, 0));
        mangas.add(new Manga(2L, "Cidade de Deus", 63, 7));
        mangas.add(new Manga(6L, "Family Guy", 4, 1));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}

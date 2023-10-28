package L_Lambda;

import L_Lambda.domain.Anime;
import L_Lambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> anime = new ArrayList<>(List.of(new Anime("Berserk",43), new Anime("Naruto", 400)));
        //Collections.sort(anime, AnimeComparators::compareByTitle);
        Collections.sort(anime, AnimeComparators::compareByEpisodes);
        System.out.println(anime);
    }
}

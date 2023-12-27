package L_Lambda;

import L_Lambda.domain.Anime;
import L_Lambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
	public static void main(String[] args) {
		List<Anime> anime = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("Naruto", 400)));
		// C1_Collections.Collections.sort(anime, AnimeComparators::compareByTitle);
		Collections.sort(anime, AnimeComparators::compareByEpisodes);
		System.out.println(anime);

		List<String> str = Arrays.asList("a", "b", "A", "B");
		str.sort(String::compareToIgnoreCase);
		System.out.println(str);
	}
}

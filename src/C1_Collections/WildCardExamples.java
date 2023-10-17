package C1_Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WildCardExamples {
	public static void printElements(List<? extends String> list) {
		list.forEach(element -> System.out.println(element));
	}

	public static void main(String[] args) {
		List<String> names = new ArrayList<>(List.of("Mateus", "Levi", "Souza"));
		List<String> test = new ArrayList<>(List.of("Frase de teste", "Segunda frase de teste"));

		printElements(names);

		// *_________________________________________________________*

		List<Integer> numbers = new ArrayList<>(List.of(12, 3, 5, 1, 9, 8, 6, 7));
		
		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
		System.out.printf("List: %s%n", sortedNumbers);
		
		List<Integer> reversedNumbers = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.printf("Reversed: %s%n", reversedNumbers);

	}

}

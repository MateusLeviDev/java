package C1_Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Maps {
	public static void main(String[] args) {
		Map<String, Integer> myMap = new HashMap<>();

		createMap(myMap);
		displayMap(myMap);
	}

	private static void createMap(Map<String, Integer> map) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string: ");

		// tokeniza a entrada
		String[] tokens = scanner.nextLine().split(" ");
		for (String token : tokens) {
			String word = token.toLowerCase(); // turn token to lower
			if (map.containsKey(word)) { // verifica se contém o token, no caso palavra
				int count = map.get(word);
				map.put(word, count + 1);
			} else
				map.put(word, 1);
		}
	}

	private static void displayMap(Map<String, Integer> map) {
		Set<String> keys = map.keySet(); // obtém chaves

		TreeSet<String> sortedKeys = new TreeSet<>(keys);

		System.out.printf("%nMap contains:%nKey\t\tValue%n");

		for (String key : sortedKeys)
			System.out.printf("%-10s%10s%n", key, map.get(key));

		System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());

	}
}

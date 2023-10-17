package C1_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsSet {
	public static void main(String[] args) {
		List<String> numbers = List.of("1", "2", "3", "4", "1");
		numbers.forEach(System.out::println);
		
		System.out.println("***************************************");
		
		Set<String> numbers2 = new HashSet<String>(Arrays.asList("1", "2", "3", "4", "1", "2", "5"));
		numbers2.forEach(System.out::println);
	}
}

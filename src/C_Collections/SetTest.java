package C_Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTest {
	private static final String[] COLORS = { "yellow", "green", "black", "tan", "grey", "white", "orange", "red",
			"green" };

	public static void main(String[] args) {

		List<String> colors = List.of(COLORS);

		printNonDuplicates(colors);

		// *___________________________________________________*

		SortedSet<String> tree = new TreeSet<String>(Arrays.asList(COLORS));
		printSet(tree);
		
		//*____________________________________________________*
		
		

	}

	public static void printNonDuplicates(Collection<String> values) {
		Set<String> set = new HashSet<>(values);
		System.out.printf("%nNonduplicates are: ");

		set.stream().forEach(value -> System.out.printf("%s ", value));

	}

	private static void printSet(SortedSet<String> set) {
		System.out.printf("%nSortedmap are: ");
		set.stream().forEach(value -> System.out.printf("%s ", value));

	}

}

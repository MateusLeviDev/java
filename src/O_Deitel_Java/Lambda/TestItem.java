package O_Deitel_Java.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestItem {
	public static void main(String[] args) {
		List<Item> itens = new ArrayList<>(Arrays.asList(new Item(1, "gdtsgvshxjhc"), new Item(2, "ucudcuhdcjbckjhd"),
				new Item(3, "biugsaddcnpo"), new Item(4, "hadihgfc-´dkvcj v")));

		System.out.println("***************** sort by id");

		itens.sort((x, y) -> Integer.compare(x.getId(), y.getId()));

		itens.forEach(System.out::println);

		System.out.println("***************** sort by name");

		itens.sort((x, y) -> x.getName().compareTo(y.getName()));
		itens.forEach(System.out::println);

		System.out.println("***************** sort by name");

		System.out.println("Sort by name");
		itens.sort(Comparator.comparing(item -> item.getName()));
		itens.forEach(System.out::println);

	}
}

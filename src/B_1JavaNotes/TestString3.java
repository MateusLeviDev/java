package B_1JavaNotes;

import java.util.Arrays;

public class TestString3 {

	public static void main(String[] args) {

		// finding a string within another string

		String str = "Hello World";
		String str1 = "Hello";
		String str2 = "HellO";

		if (str.contains(str1))
			System.out.println("Contains");

		if (str1.equalsIgnoreCase(str2))
			System.out.println("Equals ignored");

		System.out.println(str.contains(str2));

		System.out.println("*************************************************");

		String str3 = "Hello World";
		String str4 = "wOr";
		str3.indexOf(str4);
		str3.toLowerCase().contains(str4.toLowerCase());
		str3.toLowerCase().indexOf(str4.toLowerCase());

		// The String.indexOf() method returns the first index of a char or String in
		// another String. The method returns
		// -1 if it is not found.

		System.out.println("**************************************************");

		String a = "alpha";
		String b = "alpha";
		String c = new String("alpha");

		// All three strings are equivalent
		System.out.println(a.equals(b) && b.equals(c));
		// Although only a and b reference the same heap object
		System.out.println(a == b);
		System.out.println(a != c);
		System.out.println(b != c);

		System.out.println("**************************************************");

		String lineFromCsvFile = "Mickey;Bolton;12345;121216";
		String[] dataCells = lineFromCsvFile.split(";");
		System.out.println(Arrays.toString(dataCells));

		String[] firstNames = "Mickey, Frank, Alicia, Tom".split(", ");
		System.out.println(Arrays.toString(firstNames));
		// Result is firstNames = {"Mickey", "Frank", "Alicia", "Tom"};

		System.out.println("***************************************************");

		String s = "a|b|c";
		String[] arr = s.split("\\|");
		System.out.println(Arrays.toString(arr));

	}

}

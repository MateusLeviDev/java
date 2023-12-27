package O_Deitel_Java.Arrays;

public class ArraysTest {
	public static void main(String[] args) {
		int[] arr = new int[10];
		final int ARRAY_LENGTH = 10;

		System.out.printf("%s%8s%n", "Index", "Value");

		for (int i = 0; i < arr.length; i++)
			System.out.printf("%5d%8d%n", i, arr[i]);

		System.out.println("=========================");
		int[] arr2 = { 1, 5, 7, 9, 3, 56, 24, 78, 71 };

		System.out.printf("%s%8s%n", "Index", "Value");

		for (int i = 0; i < arr2.length; i++)
			System.out.printf("%5d%8d%n", i, arr2[i]);

		System.out.println("=========================");

		int[] arr3 = new int[ARRAY_LENGTH];

		for (int i = 0; i < arr3.length; i++)
			arr3[i] = 2 + 2 * i;

		System.out.printf("%s%8s%n", "Index", "Value");

		for (int i = 0; i < arr3.length; i++)
			System.out.printf("%5d%8d%n", i, arr3[i]);

	}
}

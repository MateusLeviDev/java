package O_Deitel_Java.LogicalOperators;

public class ForCounter {
	public static void main(String[] args) {
		for (int counter = 1; counter <= 10; counter++) {
			System.out.printf("%d ", counter);
		}

		System.out.println();

		for (int i = 2; i <= 20; i += 3) {
			System.out.printf("%d ", i);
		}

		System.out.println();

		for (int i = 1; i <= 30; i++) {
			if (i % 2 == 0) {
				System.out.printf("%d ", i);
			}
		}
	}
}

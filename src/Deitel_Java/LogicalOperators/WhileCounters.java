package Deitel_Java.LogicalOperators;

public class WhileCounters {
	public static void main(String[] args) {
		int counter = 1;

		while (counter <= 10) {
			System.out.printf("%d ", counter);
			counter++;
		}
		System.out.println();
	}
}

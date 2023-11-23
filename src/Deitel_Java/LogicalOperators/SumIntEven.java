package Deitel_Java.LogicalOperators;

public class SumIntEven {
	public static void main(String[] args) {
		int total = 0;

		for (int i = 2; i <= 20; i++) {
			if (i % 2 == 0) {
				total += i;
			}
		}
		System.out.println(total);
	}
}

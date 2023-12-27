package A_LeetCode;

public class MultiplesOfFive {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			if (!(i % 5 == 0)) {
				System.out.println(i);
			}
		}
	}
}

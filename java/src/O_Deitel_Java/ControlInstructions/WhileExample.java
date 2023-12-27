package O_Deitel_Java.ControlInstructions;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int total = 0;
		int gradeCounter = 1;

		while (gradeCounter <= 10) {
			System.out.print("Enter a grade: ");
			int grade = scanner.nextInt();
			total += grade;
			gradeCounter += 1;
		}

		int average = total / 10;

		System.out.printf("%nTotal of all 10 grades is %d%n", total);
		System.out.printf("Class average is %d%n", average);
	}
}

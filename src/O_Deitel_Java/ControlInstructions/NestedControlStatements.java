package O_Deitel_Java.ControlInstructions;

import java.util.Scanner;

public class NestedControlStatements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int passes = 0;
		int failures = 0;
		int studentsCounter = 1;

		while (studentsCounter <= 10) {
			System.out.print("insert notes: ");
			int grade = scanner.nextInt();

			if (grade < 0 || grade > 10) {
				System.out.println("Insira um valor entre 1 e 10.");
				continue; // Volta para o início do loop sem incrementar studentsCounter
			}
			if (grade >= 7) {
				passes++;
			} else {
				failures++;
			}

			studentsCounter++;
		}

		System.out.println("Alunos aprovados: " + passes);
		System.out.println("Alunos reprovado: " + failures);

		if (passes > 8)
			System.out.println("Bonus!");
	}
}

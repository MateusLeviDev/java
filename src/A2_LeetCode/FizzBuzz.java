package A2_LeetCode;

public class FizzBuzz {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			String output = i % 3 == 0 ? "Fizz" : "";
			output += i % 5 == 0 ? "Buzz" : "";

			if (output.isEmpty()) {
				output = Integer.toString(i);
			}
 
			System.out.println(output);
		}
	}
}
/*
 * o operador +=concatena a string à direita à string à esquerda, enquanto o
 * operador = atribui a string à esquerda o valor da string à direita.
 * 
 * Isso permite que o código adicione a string Buzz à string output mesmo que a
 * string output já contenha a string Fizz. como é o caso de i = 15 == fizzbuzz
 */
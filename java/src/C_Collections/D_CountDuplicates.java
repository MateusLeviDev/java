package C_Collections;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class D_CountDuplicates {

	public static void main(String[] args) {
		String frase = "Esta é uma frase de teste. C1_Collections.Collections é um objeto que referencia outros objetos.";
		String[] palavras = frase.split("\\s+");
		
		System.out.println(Arrays.asList(palavras));
		Map<String, Long> contagemPalavras = Arrays.stream(palavras)
				.collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

		System.out.println("Duplicadas: ");
		contagemPalavras.forEach((palavra, contagem) -> {
			if (contagem > 1)
				System.out.println(palavra + ": " + contagem + " vezes");
		});
	}
}

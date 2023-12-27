package RandomCodeExamples.nvoip1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Teste {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 18; i++) {
			list.add(i + 1);
		}
		System.out.println("Lista Original: " + list);
		List<Integer> novaLista = new ArrayList<>();
		int tamanhoLista = list.size();
		if (tamanhoLista > 15) {
			novaLista.add(list.get(0)); // Adiciona o primeiro elemento à nova lista
			int idx = tamanhoLista - 14; // Começa do segundo elemento na lista original
			novaLista.addAll(IntStream.range(idx, list.size()).mapToObj(i -> list.get(i)).collect(Collectors.toList()));
		} else {
			novaLista.addAll(list); // Se a lista for menor ou igual a 15, copie todos os elementos
		}
		System.out.println("Nova Lista: " + novaLista);
	}
}
package Deitel_Java.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestUsuario {
	public static void main(String[] args) {
		List<Usuario> usuarios = new ArrayList<>(Arrays.asList(new Usuario("Levi", 250), new Usuario("Carlos", 200),
				new Usuario("Dudu", 215), new Usuario("Soma", 198)));

		System.out.println(
				usuarios.stream().sorted(Comparator.comparing(Usuario::getPontos)).collect(Collectors.toList()));
	}
}

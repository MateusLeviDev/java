package O_Deitel_Java.Lambda;

public class Usuario {
	private String nome;
	private int pontos;
	private boolean moderador;

	public Usuario(String nome, int pontos) {
		this.nome = nome;
		this.pontos = pontos;
		this.moderador = false;
	}

	public String getNome() {
		return nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void tornarModerador() {
		this.moderador = true;
	}

	public boolean isModerador() {
		return moderador;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", pontos=" + pontos + "]";
	}

}

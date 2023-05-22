package logicaProgramacao;

public class LivroDisponivel extends Livro { 
	String titulo;
	String autor; 
	String editora;
	int quantidade;
	
	public LivroDisponivel(String titulo, String autor, String editora, int quantidade) {
		super(titulo, autor, editora);
		 this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getTitulo() {
		return titulo;
	}

	
	
	 
	
	
	
	
}

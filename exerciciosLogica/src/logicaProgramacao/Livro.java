package logicaProgramacao;

public class Livro {
	
	protected String titulo;
	protected String autor;
	protected String editora;
	
	
	public Livro(String titulo,String autor,String editora) {
		this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
	}


	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditora() {
		return editora;
	}

	}
	
	
	
	
	


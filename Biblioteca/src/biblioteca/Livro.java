package biblioteca;

public class Livro extends Publicacao {

	private int numeroEdicao;
	private String nomeEditora;
	private int isbn;

	public Livro(String dataPublicacao, String tituloPublicacao, int numeroEdicao, String nomeEditora, int isbn) {
		super(dataPublicacao, tituloPublicacao);
		this.numeroEdicao = numeroEdicao;
		this.nomeEditora = nomeEditora;
		this.isbn = isbn;
	}

	
	public int getNumeroEdicao() {
		return numeroEdicao;
	}

	public void setNumeroEdicao(int numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
	}

	public String getNomeEditora() {
		return nomeEditora;
	}

	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

}

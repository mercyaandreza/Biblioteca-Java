package biblioteca;

public class Autor {

	private String nome;
	private TitulacaoAutorEnum titulacao;

	public Autor(String nome, TitulacaoAutorEnum titulacao) {
		super();
		this.nome = nome;
		this.titulacao = titulacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TitulacaoAutorEnum getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(TitulacaoAutorEnum titulacao) {
		this.titulacao = titulacao;
	}

}

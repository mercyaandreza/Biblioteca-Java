package biblioteca;

import java.util.ArrayList;
import java.util.List;

public abstract class Publicacao {

	private List<Publicacao> referencia;
	private List<Autor> autores;
	private String dataPublicacao;
	private String tituloPublicacao;
	private final int limiteRef = 255;
	private final int limiteAutor = 255;

	public Publicacao(String dataPublicacao, String tituloPublicacao) {
		super();
		this.referencia = new ArrayList<>();
		this.autores = new ArrayList<>();
		this.dataPublicacao = dataPublicacao;
		this.tituloPublicacao = tituloPublicacao;
	}

	public void addAutor(Autor aut) {
		if (autores.size() <= limiteAutor) {
			autores.add(aut);
			System.out.println("Adicionado Autor ");
		} else {
			throw new ErroExpeption("Limite ");
		}
	}

	public void addRef(Publicacao ref) {
		if (referencia.size() <= limiteRef) {
			referencia.add(ref);
			System.out.println("Adicionado Referencia ");
		} else {
			throw new ErroExpeption("Limite ");

		}
	}

	public void imprimiAutor() {
		for (Autor autor : autores) {
			System.out.println(" " + autor.getNome() + " " + autor.getTitulacao());
		}

	}

	public void imprimiReferencia() {
		for (Publicacao publicacao : referencia) {
			System.out.println(" " + publicacao.getDataPublicacao() + publicacao.getTituloPublicacao());

		}
	}

	public List<Publicacao> getReferencia() {
		return referencia;
	}

	public void setReferencia(List<Publicacao> referencia) {
		this.referencia = referencia;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	public String getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getTituloPublicacao() {
		return tituloPublicacao;
	}

	public void setTituloPublicacao(String tituloPublicacao) {
		this.tituloPublicacao = tituloPublicacao;
	}

}

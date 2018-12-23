package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private String nome;
	private String endereco;
	private List<Publicacao> publi; // armazenar publicações dentro de biblioteca
	private final int limitePubli = 65535;

	public Biblioteca(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.publi = new ArrayList<>();
	}

	public void addPublicacao(Publicacao publicacao) {
		if(publi.size() <= limitePubli) {
			publi.add(publicacao);
		}else {
			throw new ErroExpeption ("Limite ");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Publicacao> getPubli() {
		return publi;
	}

	public void setPubli(List<Publicacao> publi) {
		this.publi = publi;
	}

}

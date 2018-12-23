package biblioteca;

public class Artigo extends Publicacao {

	private String resumo;

	public Artigo(String dataPublicacao, String tituloPublicacao, String resumo) {
		super(dataPublicacao, tituloPublicacao);
		this.resumo = resumo;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

}

package biblioteca;

public class Main {

	public static void main(String[] args) {

		Biblioteca b1 = new Biblioteca("Biblioteca Salvador", " Rua ladeira da Casa");
		System.out.println(" " + b1.getNome() + b1.getEndereco());

//		System.out.println(": "+a1.getDataPublicacao()+a1.getResumo());

		Artigo a1 = new Artigo(" 11/12/2389", " A culpa é das estrelas",
				"\nHazel Grace Lancaster e Augustus Waters são dois adolescentes que se conhecem em um grupo de apoio para pacientes com câncer. "
						+ "\nPor causa da doença, Hazel sempre descartou a ideia de se envolver amorosamente, mas acaba cedendo ao se apaixonar "
						+ "\npor Augustus.Juntos, eles viajam para Amsterdã, onde embarcam em uma jornada inesquecível.");
		Autor mercya = new Autor("Andreza", TitulacaoAutorEnum.MESTRADO);
		a1.addAutor(mercya);
		a1.addRef(a1);
		a1.imprimiAutor();
		a1.imprimiReferencia();
		System.out.println("\t Resumo:" + a1.getResumo());
		

//	Livro l1 = new Livro("43/45/1234", "Café", 34, "CAP", 45);
//	Autor oliveira = new Autor("Oliveira", TitulacaoAutorEnum.MESTRADO);
//	l1.addAutor(oliveira);
//	l1.addRef(l1);	
//	l1.imprimiAutor();
//	//
//	Autor andreza = new Autor("Andreza",  TitulacaoAutorEnum.GRADUADO);
//
//	Artigo artigo = new Artigo("43","43","tr");
//	artigo.addAutor(andreza);
//	artigo.addRef(artigo);
//	artigo.imprimiReferencia();

	}

}

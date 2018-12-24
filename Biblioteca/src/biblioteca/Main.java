package biblioteca;

public class Main {

	public static void main(String[] args) {

		Biblioteca b1 = new Biblioteca("Biblioteca Salvador", " Rua ladeira da Casa");
		System.out.println(" " + b1.getNome() + b1.getEndereco());

//		System.out.println(": "+a1.getDataPublicacao()+a1.getResumo());

		Artigo a1 = new Artigo(" 11/12/2389", " A culpa � das estrelas",
				"\nHazel Grace Lancaster e Augustus Waters s�o dois adolescentes que se conhecem em um grupo de apoio para pacientes com c�ncer. "
						+ "\nPor causa da doen�a, Hazel sempre descartou a ideia de se envolver amorosamente, mas acaba cedendo ao se apaixonar "
						+ "\npor Augustus.Juntos, eles viajam para Amsterd�, onde embarcam em uma jornada inesquec�vel.");
		Autor mercya = new Autor("Andreza", TitulacaoAutorEnum.MESTRADO);
		a1.addAutor(mercya);
		a1.addRef(a1);
		a1.imprimiAutor();
		a1.imprimiReferencia();
		System.out.println("\t Resumo:" + a1.getResumo());
		

//	Livro l1 = new Livro("43/45/1234", "Caf�", 34, "CAP", 45);
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

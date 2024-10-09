package RelacionamentoDeClasse.Associacao;

public class ClassePrincipal {

	public static void main(String[] args) {
		 Universidade universidade = new Universidade("USE");
		 Estudante estudante = new Estudante ("João", universidade);
		 
		 System.out.println("Estudante: " + estudante.getNome() + "\nUniversidade: " + universidade.getNome());

	}

}

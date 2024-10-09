package RelacionamentoDeClasse.Agregacao;

public class MainLivro {

	public static void main(String[] args) {
        Autor autor = new Autor("Machado de Assis");
        Livro livro = new Livro("Dom Casmurro", autor);

        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
    }
}

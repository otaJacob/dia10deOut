package RelacionamentoDeClasse.Agregacao;

public class MainEmpresa {

	public static void main(String[] args) {

		Departamento departamento = new Departamento("Recursos Humanos");
		Empresa empresa = new Empresa("Minha Empresa", departamento);

		System.out.println("Empresa: " + empresa.getNome());
		System.out.println("Departamento: " + empresa.getDepartamento().getNome());
	}
}

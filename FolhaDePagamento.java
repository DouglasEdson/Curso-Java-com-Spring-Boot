import empresa.dados.Funcionario;

public class FolhaDePagamento {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Douglas", 5000.00);
		System.out.println(funcionario.obterInfo());
	}
}
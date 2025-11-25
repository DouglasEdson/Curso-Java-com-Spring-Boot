public class Bolo {
	
	int quantidadeDeAcucar;

	public static void main(String[] args) {

		Bolo boloDeChocolate = new Bolo();

		boloDeChocolate.quantidadeDeAcucar = 200;

		Bolo boloDeBaunilha = new Bolo();

		boloDeBaunilha.quantidadeDeAcucar = 150;

		System.out.println("Quantidade de açucar no bolo de chocolate: " 
			+ boloDeChocolate.quantidadeDeAcucar);

		System.out.println("Quantidade de açucar no bolo de baunilha: " 
			+ boloDeBaunilha.quantidadeDeAcucar);

	}
}
class Produto {
	// Atributos privados (encapsulamento)
	private String nome;
	private double preco;
	private int quantidadeEmEstoque;

	//Construtor público para inicializar os atributos
	public Produto(String nome, double preco, int quantidadeEmEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEmEstoque = quantidadeEmEstoque;		

	}

	// Método público para exibir os atributos
	public void exibirProduto() {
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
		System.out.println("-----------------------------------------------");

	}
	
	}


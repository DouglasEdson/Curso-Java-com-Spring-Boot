public class SomaNumerosInteiros{
	public static void main(String[] args){
	int numero = 10;
	int soma = 0;

	// calcula a soma dos números inteiros positivos
	do {
		soma += numero;
		numero--; // Decrementa o número para a próxima iteração
	} while (numero > 0);

	// Exibe o resultado da soma
	System.out.println("A soma dos números inteiros positivos é: " + soma);
	}
}
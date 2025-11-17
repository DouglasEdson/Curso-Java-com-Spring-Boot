import java.util.Scanner;

public class CalculadoraSimples {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor de a: ");
		int a = entrada.nextInt();
		System.out.print("Digite o valor de b: ");
		int b = entrada.nextInt();

		System.out.println("/nEscolha a operação:");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("5 - Resto da divisão");

		System.out.print("Digite o número da operação desejada: ");
		int opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Resultado da soma: " + (a+b));
			break;
		case 2:
			System.out.println("Resultado da subtração: " + (a-b));
			break;
		case 3:
			System.out.println("Resultado da multiplicação: " +(a*b));
			break;
		case 4:
			if (b!= 0){
				System.out.println("Resultado da divisão: " + (a/b));
			} else {
				System.out.println("Erro: divisão por zero!");
			}
			break;
		case 5:
			if (b!=0) {
				System.out.println("Resto da divisão: " + (a%b));
			} else {
				System.out.println("Erro: divisão por zero!");
			}
			break;
			default:
			System.out.println("Opção inválida.");
		}

		entrada.close();

	}
}
